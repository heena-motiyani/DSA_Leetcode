package dsa.arrays;

import java.util.Scanner;

public class LeftRotateArrayByKPlaces {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		k = k%n;
		leftRotate(arr, n, k);
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
//	Brute Force TC - O(n) SC - O(n)
//	public static void leftRotate(int[] arr, int n, int k) {
//		int[] temp = new int[k];
//		for(int i=0; i<k; i++) {
//			temp[i] = arr[i];
//		}
//		for(int i=k; i<n; i++) {
//			arr[i-k] = arr[i];
//		}
//		for(int i=n-k; i<n; i++) {
//			arr[i] = temp[i-(n-k)];
//		}
//	}
	public static void leftRotate(int[] arr, int n, int k) {
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
		reverse(arr, 0, n-1);
	}
	public static void reverse(int []arr, int i, int j) {
		while(i < j) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
	}
	}
}
