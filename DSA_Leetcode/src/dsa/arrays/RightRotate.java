package dsa.arrays;

import java.util.Scanner;

public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		k = k%n;
		rightRotate(arr, n, k);
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		

	}
//	Brute Force TC - O(n) SC - O(n)
//	public static void rightRotate(int[] arr, int n, int k) {
//		int[] temp = new int[n-k];
//		for(int i=0; i<n-k; i++) {
//			temp[i] = arr[i];
//		}
//		for(int i=n-k; i<n; i++) {
//			arr[i-(n-k)] = arr[i];
//		}
//		for(int i=k; i<n; i++) {
//			arr[i] = temp[i-k];
//		}
//	}
	public static void rightRotate(int[] arr, int n, int k) {
		reverse(arr, 0, n-k-1);
		reverse(arr, n-k, n-1);
		reverse(arr, 0, n-1);
	}
	public static void reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
	}

}
