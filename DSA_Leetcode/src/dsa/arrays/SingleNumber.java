package dsa.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumber {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int arr[] = new int[n];
	 for(int i=0; i<n; i++) {
		 arr[i] = sc.nextInt();
	 }
	 System.out.println(singleNumber(arr));
 }
// Brute  Force 
// Tc - O(n*n) SC - O(1)
// public static int singleNumber(int []arr) {
//	 for(int i=0; i<arr.length; i++) {
//		 int num = arr[i];
//		 int cnt = 0;
//		 for(int j=0; j<arr.length; j++) {
//			 if(arr[j] == num) cnt++;
//		 }
//		 if(cnt == 1) return num;
//	 }
//	 return -1;
// }
 
 // not preferable when the array size is too large or the array elements are negative
// TC - o(n) SC - O(n)
// public static int singleNumber(int[] arr) {
//	 int n = arr.length;
//	 int maxi = arr[0];
//	 for(int i=1; i<n; i++) {
//		 maxi = Math.max(maxi, arr[i]);
//	 }
//	 int count[] = new int[maxi + 1];
//	 for(int i=0; i<n; i++) {
//		 count[arr[i]]++;
//	 }
//	 for(int i=0; i<count.length; i++) {
//		 if(count[i] == 1)
//			 return i;
//	 }
//	 return -1;
// }
// TC - O(n) SC - O(n)
// public static int singleNumber(int[] arr) {
//	 Map<Integer, Integer> map = new HashMap<>();
//	 for(int i=0; i<arr.length; i++) {
//		 map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
//	 }
//	 for(Map.Entry<Integer, Integer> it: map.entrySet()) {
//		 if(it.getValue()==1) return it.getKey();
//	 }
//	 return -1;
// }
// Numbers have 2 appear exactly twice in this case except one
// TC- O(n) SC - O(1)
public static int singleNumber(int[] arr) {
	int xor = 0;
	for(int i=0; i<arr.length; i++) {
		xor ^= arr[i];
	}
	return xor;
}
}
