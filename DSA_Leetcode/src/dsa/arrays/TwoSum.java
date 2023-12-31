package dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int res[] = twoSum(arr, target);
		System.out.println(res[0] + " " + res[1]);
		

	}
//	TC - O(n*n) SC - O(1)
//	public static int[] twoSum(int[] arr, int target) {
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if((arr[i] + arr[j]) == target) {
//					return new int[] {i, j};
//				}
//			}
//		}
//		return new int[] {-1, -1};
//	}
//	TC - O(n) SC - O(n)
//	public static int[] twoSum(int[] arr, int target) {
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i=0; i<arr.length; i++) {
//			if(map.containsKey(target-arr[i])) {
//				return new int[]{map.get(target-arr[i]), i};
//			}
//			map.put(arr[i], i);
//		}
//		return new int[] {-1, -1};
//	}
	public static int[] twoSum(int[] arr, int target) {
		int temp[] = Arrays.copyOf(arr, arr.length);
		int ans[] = new int[2];
		int left = 0, right = arr.length-1;
		while(left < right) {
			int sum = arr[left] + arr[right];
			if(sum == target) {
				break;
			} else if(sum < target) {
				left++;
			} else {
				right--;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(temp[i] == arr[left]) {
				ans[0] = i;
				break;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(temp[i] == arr[right]) {
				ans[1] = i;
				break;
			}
		}
		return ans;
	}

}
