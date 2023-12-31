package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UniquePaths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(uniquePath(m, n));
	}
//	public static int uniquePath(int m, int n) {
//		return countPaths(0, 0, m, n);
//	}
//	public static int countPaths(int i, int j, int m, int n) {
//		if(i>=m || j>=n) return 0;
//		if(i==(m-1) && j==(n-1)) return 1;
//		return countPaths(i+1, j ,m ,n) + countPaths(i, j+1, m, n);
//	}
//	public static int uniquePath(int m, int n) {
//		int dp[][] = new int[m][n];
//		for(int[] row: dp) {
//			Arrays.fill(row, -1);
//		}
//		return countPaths(0, 0, m, n, dp);
//	}
//	public static int countPaths(int i, int j, int m, int n, int[][] dp) {
//		if(i>=m || j>=n) return 0;
//		if(i==(m-1) && j==(n-1)) return 1;
//		if(dp[i][j] != -1) return dp[i][j];
//		return dp[i][j] = countPaths(i+1, j, m, n, dp) + countPaths(i, j+1, m, n, dp);
//	}
	public static int uniquePath(int m, int n) {
		int N = m+n-2;
		int r = m-1;
		int res = 1;
		for(int i=1; i<=r; i++) {
			res*=(N-r+i)/i;
		}
		return res;
	}

}
