package dsa.arrays;

import java.util.Scanner;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] matrix = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int target = sc.nextInt();
		System.out.println(searchIn2DArray(matrix, target));

	}
//	public static boolean searchIn2DArray(int[][] matrix, int target) {
//		for(int i=0; i<matrix.length; i++) {
//			for(int j=0; j<matrix[0].length; j++) {
//				if(target == matrix[i][j]) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
//	public static boolean searchIn2DArray(int[][] matrix, int target) {
//		for(int i=0; i<matrix.length; i++) {
//			if(target >= matrix[i][0] && target <= matrix[i][matrix.length-1]) {
//				int left = 0, right = matrix.length-1;
//				while(left<right) {
//					int mid = left + (right-left)/2;
//					if(matrix[i][mid] == target) return true;
//					else if(target > matrix[i][mid]) left++;
//					else right--;
//				}
//			}
//		}
//		return false;
//	}
	public static boolean searchIn2DArray(int[][] matrix, int target) {
		int m = matrix.length, n = matrix[0].length;
		int left = 0, right = (m*n)-1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			int r = mid/n;
			int c = mid%n;
			if(matrix[r][c] == target) return true;
			else if(matrix[r][c] < target) {left=mid+1;}
			else {right = mid-1;}
		}
		return false;
	}

}
