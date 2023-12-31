package dsa.arrays;

import java.util.Scanner;

public class StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prices[] = new int[n];
		for(int i=0; i<n; i++) {
			prices[i] = sc.nextInt();
		}
		System.out.println(stockBuyAndSell(prices));

	}
//	public static int stockBuyAndSell(int[] prices) {
//		int maxProfit = 0;
//		for(int i=0; i<prices.length; i++) {
//			for(int j=i+1; j<prices.length; j++) {
//				maxProfit = Math.max(maxProfit, prices[j]-prices[i]);
//			}
//		}
//		return maxProfit;
//	}
	public static int stockBuyAndSell(int[] prices) {
		int maxProfit = 0;
		int minPrice = prices[0];
		for(int i=1; i<prices.length; i++) {
			maxProfit = Math.max(maxProfit, prices[i]-minPrice);
			minPrice = Math.min(minPrice, prices[i]);
		}
		return maxProfit;
	}

}
