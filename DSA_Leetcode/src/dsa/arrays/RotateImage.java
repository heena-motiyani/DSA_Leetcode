package dsa.arrays;

import java.util.Scanner;

public class RotateImage {

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
		rotateImage(matrix);
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}
//	public static void rotateImage(int[][] matrix) {
//		int m = matrix.length;
//		int n = matrix[0].length;
//		int temp[][] = new int[m][n];
//		for(int i=0; i<m; i++) {
//			for(int j=0; j<n; j++) {
//				temp[j][n-i-1] = matrix[i][j];
//			}
//		}
//		for(int i=0; i<matrix.length; i++) {
//			for(int j=0; j<matrix[0].length; j++) {
//				matrix[i][j] = temp[i][j];
//			}
//		}
//	}
	public static void rotateImage(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		for(int i=0; i<m; i++) {
			for(int j=i; j<n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for(int i=0; i<m; i++) {
			for(int j=0; j<n/2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n-j-1];
				matrix[i][n-j-1] = temp;
			}
		}
	}

}
