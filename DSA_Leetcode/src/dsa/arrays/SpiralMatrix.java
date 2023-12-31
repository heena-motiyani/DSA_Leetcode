package dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int matrix[][] = new int[m][n];
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		List<Integer> res = spiralMatrix(matrix);
		for(Integer ele: res) {
			System.out.println(ele);
		}

	}
	public static List<Integer> spiralMatrix(int[][] matrix) {
		int left = 0, top = 0, right = matrix[0].length-1, bottom = matrix.length-1;
		List<Integer> res = new ArrayList<>();
		while(left<=right && top<=bottom) {
			for(int i=left; i<=right; i++) {
				res.add(matrix[top][i]);
			}
			top++;
			for(int i=top; i<=bottom; i++) {
				res.add(matrix[i][right]);
			}
			right--;
			if(top<=bottom) {
			for(int i=right; i>=left; i--) {
				res.add(matrix[bottom][i]);
			}
			bottom--;
			}
			if(left<=right) {
			for(int i=bottom; i>=top; i--) {
				res.add(matrix[i][left]);
			}
			left++;
			}
		}
		return res;
	}

}
