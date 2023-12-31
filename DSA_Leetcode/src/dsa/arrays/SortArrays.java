package dsa.arrays;

import java.util.Scanner;

public class SortArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sortArray(arr);
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}

	}
//	Sort an array of 0s, 1s and 2s
//	BruteForce : simply sort the array TC- O(nlogn) SC - O(1)
//	BetterApproach count frequency of 0, 1 and 2 and place them in the array according to frequency
//	OptimalApproach: Dutch National Algorithm, maintain 3 pointers, low, mid and high
//	TC - O(N)+O(N) SC - O(1)
//	public static void sortArray(int[] arr) {
//		int cnt1 = 0, cnt2 = 0, cnt3 = 0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] == 0) cnt1++;
//			else if(arr[i] == 1) cnt2++;
//			else cnt3++;
//		}
//		for(int i=0; i<cnt1; i++) {
//			arr[i] = 0;
//		}
//		for(int i=cnt1; i<cnt1+cnt2; i++) {
//			arr[i] = 1;
//		}
//		for(int i=cnt1+cnt2; i<arr.length; i++) {
//			arr[i] = 2;
//		}
//	}
	public static void sortArray(int[] arr) {
		int low = 0, mid = 0, high = arr.length-1;
		while(mid<=high) {
			switch(arr[mid]) {
			case 0: {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++; mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;	
				break;
			}
		  }
		}
	}
}
