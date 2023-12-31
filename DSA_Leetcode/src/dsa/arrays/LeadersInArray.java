package dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> res = leadersInArray(arr);
		for(Integer in: res) {
			System.out.println(in);
		}

	}
//	public static List<Integer> leadersInArray(int[] arr) {
//		List<Integer> res = new ArrayList<>();
//		for(int i=0; i<arr.length; i++) {
//			boolean leader = true;
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[j] > arr[i]) {
//					leader = false;
//					break;
//				}
//			}
//			if(leader) {
//				res.add(arr[i]);
//			}
//		}
//		return res;
//	}
	public static List<Integer> leadersInArray(int[] arr) {
		List<Integer> res = new ArrayList<>();
		int maxSoFar = arr.length-1;
		res.add(arr[arr.length-1]);
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i]>= maxSoFar) {
				res.add(arr[i]);
				maxSoFar = arr[i];
			}
		}
		return res;
	}

}
