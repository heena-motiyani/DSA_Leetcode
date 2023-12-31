package dsa.arrays;

import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findDuplicate(arr));

	}
	public static int findDuplicate(int[] arr) {
		int fast = arr[0];
		int slow = arr[0];
		do {
			fast = arr[arr[fast]];
			slow = arr[slow];
		}while(fast != slow);
		
		fast = arr[0];
		while(fast != slow) {
			fast = arr[fast];
			slow = arr[slow];
		}
		return fast;
	}

}
