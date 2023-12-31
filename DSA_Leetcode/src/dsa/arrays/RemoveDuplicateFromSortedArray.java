package dsa.arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = removeDuplicateFromSortedArray(arr);
		for(int i=0; i<res; i++) {
			System.out.println(arr[i]);
		}

	}
//	public static int[] removeDuplicateFromSortedArray(int[] arr) {
//		Set<Integer> set = new HashSet<>();
//		for(int i=0; i<arr.length; i++) {
//			set.add(arr[i]);
//		}
//		int res[] = new int[set.size()];
//		int i = 0;
//		for(Integer x: set) {
//			res[i++] = x;
//		}
//		return res;
//		
//	}
//	Two Pointer Approach
	public static int removeDuplicateFromSortedArray(int[] arr) {
		int i = 1;
		for(int j=1; j<arr.length; j++) {
			if(arr[j-1] != arr[j]) {
				arr[i++] = arr[j];
			}
		}
		return i;
	}
}
