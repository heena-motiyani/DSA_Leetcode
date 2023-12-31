package dsa.arrays;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(missingNumber(arr));
		
	}
//	linear search
//	public static int missingNumber(int[] arr) {
//		int n = arr.length;
//		for(int i=0; i<=n; i++) {
//			boolean flag = false;
//			for(int j=0; j<n; j++) {
//				if(i == arr[j]) {
//					flag = true;
//					break;
//				}
//			}
//			if(!flag)
//			{
//				return i;
//			}
//		}
//		return -1;
//	}
//	TC - O(N) SC- O(1)
//	public static int missingNumber(int[] arr) {
//		int n = arr.length;
//		int sum = (n * (n+1)) / 2;
//		for(int i=0; i<n; i++) {
//			sum -= arr[i];
//		}
//		return sum;
//	}
//	public static int missingNumber(int[] arr) {
//		int n = arr.length;
//		int temp[] = new int[n+1];
//		for(int i=0; i<n-1; i++) {
//			temp[arr[i]]++;
//		}
//		for(int i=0; i<temp.length; i++) {
//			if(temp[i] == 0)
//				return i;
//		}
//		return -1;
//	}
//	TC - O(N) SC - O(1)
	public static int missingNumber(int[] arr) {
		int n = arr.length;
		int xorN = 0;
		for(int i=1; i<=n; i++) {
			xorN ^= i;
		}
		for(int i=0; i<n; i++) {
			xorN ^= arr[i];
		}
		return xorN;
	}
}
