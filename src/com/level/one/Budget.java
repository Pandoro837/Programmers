package com.level.one;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {

		int[] iDepartment = {2, 2, 3, 3}; // 2, 3, 4, 4
		int iBudget = 12;
		
		int[] iDepartment2 = {3, 2, 7, 4, 3};
		int iBudget2 = 12;
		
		int answer = solution(iDepartment, iBudget);

		System.out.println("answer : " + answer);

		int answer2 = solution(iDepartment2, iBudget2);
		
		System.out.println("answer 2 : " + answer2);
		
	}
	
	//int[]를 작은 수부터 정렬, 
	private static int solution(int[] iDepartment, int iBudget) {
		int answer = 0;
		Boolean flag = true;
		
		Arrays.sort(iDepartment);
		
		while(flag) {
			iBudget = iBudget - iDepartment[answer];
			if(iBudget >= 0) {
				answer++;
				if(answer == iDepartment.length) {
					flag = false;
				}
			} else {
				flag = false;
			}
		}
		
		return answer;
	}

}
