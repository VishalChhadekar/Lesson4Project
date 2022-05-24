package com.DSA.LongestIncreasingSubsequent;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequent {
	public static void main(String[] args) {
//		int arr[] = {3, 5, 2, 6, 12, 34, 37, 24, 67, 78, 46};//ans:8
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };//ans: 5

		List<Integer> newList = new ArrayList<>();
		int first = arr[0];
		newList.add(first);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				first = arr[i];
				newList.add(arr[i]);
			}
		}
		System.out.println("Longest Increasing Subsequent: " + newList.size());
	}

}
