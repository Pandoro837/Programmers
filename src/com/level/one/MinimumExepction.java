package com.level.one;

import java.util.ArrayList;
import java.util.List;

public class MinimumExepction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 3, 2, 1};
		int[] arr2 = {10};
		int[] arr3 = {1, 3, 2, 4};
		int[] arr4 = {2, 1, 3, 4};
		int[] arr5 = {2, 3, 1, 4};
		
		for(int i : solution(arr)) {
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		
		for(int i : solution(arr2)) {
			System.out.println(i);
		}
		System.out.println("-------------------");

		for(int i : solution(arr3)) {
			System.out.println(i);
		}

		System.out.println("-------------------");
		
		for(int i : solution(arr4)) {
			System.out.println(i);
		}

		System.out.println("-------------------");
		
		for(int i : solution(arr5)) {
			System.out.println(i);
		}

	}
	
	private static int[] solution(int[] arr) {
		int[] solution = {-1};
		int min = arr[0];
		int index = 0;
		
		if(arr.length - 1 != 0) {
			for(int i = 0; i < arr.length; i++) {
				if(min > arr[i]) {
					min = arr[i];
					index = i;
				}
			}
			
			List<Integer> arrList = new ArrayList<Integer>();
			
			for(int i = 0; i < arr.length; i++) {
				arrList.add(i, arr[i]);
			}
			
			arrList.remove(index);
			
			solution = new int[arr.length - 1];
			
			for(int i = 0; i < arrList.size(); i++) {
				solution[i] = arrList.get(i);
			}
			
			return solution;
			
		} else {
			return solution;
		}
	}
	
}
