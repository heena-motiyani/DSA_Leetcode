package dsa.arrays;

import java.util.Scanner;

public class MaxConsecutiveOnes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxConsecutiveOnes(arr, n));
	}
	public static int maxConsecutiveOnes(int[] arr, int n) {
		int count = 0;
		int max = -1;
		for(int i=0; i<n; i++) {
			if(arr[i] == 1) count++;
			else count = 0;
			max = Math.max(max, count);
		}
		return max;
	}
}
