package dsa.arrays;

import java.util.Scanner;

public class MoveZeroestoEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		moveZeroesToEnd(arr, n);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
// Brute Force TC - O(n) SC - O(1)
//	public static int[] moveZeroesToEnd(int arr[], int n) {
//		int temp[] = new int[n];
//		int j = 0;
//		for(int i=0; i<n; i++) {
//			if(arr[i] != 0) {
//				temp[j++] = arr[i];
//			}
//		}
//		return temp;
//	}
	public static void moveZeroesToEnd(int[] arr, int n) {
		int j = -1;
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) {
				j = i;
				break;
			}
		}
		if(j==-1) return;
		for(int i=j+1; i<n; i++) {
			if(arr[i] != 0) {
				swap(arr, i, j++);
			}
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
