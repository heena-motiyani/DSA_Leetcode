package dsa.arrays;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class FindUnion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
//		System.out.println("n1: " + n1 + ", n2: " + n2);
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		for(int i=0; i<n1; i++) {
			arr1[i] = sc.nextInt();
		}
//		System.out.println("arr1: " + Arrays.toString(arr1));
		for(int i=0; i<n2; i++) {
			arr2[i] = sc.nextInt();
		}
//		System.out.println("arr2: " + Arrays.toString(arr2));
		List<Integer> res = findUnion(arr1, arr2);
		for(Integer element: res) {
			System.out.println(element);
		}
		

	}
//	public static List<Integer> findUnion(int[] arr1, int[] arr2) {
//		Map<Integer, Integer> map = new TreeMap<>();
//		for(int i=0; i<arr1.length; i++) {
//			map.put(arr1[i], null);
//		}
//		for(int i=0; i<arr2.length; i++) {
//			map.put(arr2[i], null);
//		}
//		ArrayList<Integer> res = new ArrayList<>();
//		for(Integer i: map.keySet()) {
//			res.add(i);
//		}
//		return res;
//		
//	}
//	
//	public static List<Integer> findUnion(int[] arr1, int[] arr2) {
//		Set<Integer> set = new TreeSet<>();
//		for(int i=0; i<arr1.length; i++) {
//			set.add(arr1[i]);
//		}
//		for(int i=0; i<arr2.length; i++) {
//			set.add(arr2[i]);
//		}
//		List<Integer> res = new ArrayList<>(set);
//		return res;
//	}

	public static List<Integer> findUnion(int[] arr1, int arr2[]) {
		int i=0, j=0;
		int n1 = arr1.length, n2 = arr2.length;
		List<Integer> res = new ArrayList<>();
		while(i<n1 && j <n2) {
			if(arr1[i] <= arr2[j]) {
				if(res.isEmpty() || (res.get(res.size()-1) != arr1[i])){
					res.add(arr1[i]);
				}
				i++;
			} else {
				if(res.isEmpty() || (res.get(res.size()-1) != arr2[j])) {
					res.add(arr2[j]);
				}
				j++;
			}
		}
		while(i < n1) {
			if(res.isEmpty() || (res.get(res.size()-1) != arr1[i])){
				res.add(arr1[i]);
			}
			i++;
		}
		while(j < n2) {
			if(res.isEmpty() || (res.get(res.size()-1) != arr2[j])) {
				res.add(arr2[j]);
			}
			j++;
		}
	
		return res;

}
}