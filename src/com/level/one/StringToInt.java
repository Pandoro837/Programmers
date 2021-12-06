package com.level.one;

public class StringToInt {

	public static void main(String[] args) {

		String s = "+1234";
		String s2 = "-5321";
		String s3 = "123";
		
		System.out.println(solution(s));
		System.out.println(solution(s2));
		System.out.println(solution(s3));

	}

	static int solution(String s) {
		
		//문자열의 가장 앞 문자가 + 혹은 -의 부호일 경우, parseInt 함수가 아래 과정을 처리하여 준다
		int iAnswer = Integer.parseInt(s);
		
//		int iAnswer = 0;
//		String sign = s.substring(0);
//		
//		if(sign == "+") {
//			s = s.substring(1);
//			iAnswer = Integer.parseInt(s);
//		} else if (sign =="-") { 
//			s = s.substring(1);
//			iAnswer = -1 * Integer.parseInt(s);
//		} else {
//			iAnswer = Integer.parseInt(s);
//		}
		
		return iAnswer;
	}
	
}
