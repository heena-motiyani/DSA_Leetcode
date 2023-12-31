package dsa.arrays;

import java.util.Scanner;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maximumSubarraySum(arr));

	}
//	public static int maximumSubarraySum(int[] arr) {
//		int maxSum = Integer.MIN_VALUE;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i; j<arr.length; j++) {
//				int sum = 0;
//				for(int k=i; k<=j; k++) {
//					sum+=arr[k];
//				}
//				maxSum = Math.max(maxSum, sum);
//			}
//		}
//		return maxSum;
//	}
//	public static int maximumSubarraySum(int[] arr) {
//		int maxSum = Integer.MIN_VALUE;
//		for(int i=0; i<arr.length; i++) {
//			int sum = 0;
//			for(int j=i; j<arr.length; j++) {
//				sum+=arr[j];
//				maxSum = Math.max(maxSum, sum);
//			}
//		}
//		return maxSum;
//	}
	public static int maximumSubarraySum(int[] arr) {
		int sum = 0;
		int start = -1, ansStart = -1, ansEnd = -1;
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(sum == 0) start = i;
			sum+=arr[i];
			if(sum > maxSum) {
				ansStart = start;
				ansEnd = i;
				maxSum = sum;
			}
			if(sum<0) sum = 0;
		}
		for(int i=ansStart; i<=ansEnd; i++) {
			System.out.println(arr[i]);
		}
		return maxSum;
	}
}
