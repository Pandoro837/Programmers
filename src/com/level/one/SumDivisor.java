package com.level.one;

public class SumDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 12;
		int iNum2 = 5;
		
		System.out.println(solution(iNum));
		System.out.println(solution(iNum2));

	}
	
	private static int solution(int n) {
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer+= i;
			}
		}
		
		return answer;
	}

}
