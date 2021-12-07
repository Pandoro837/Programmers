package com.level.one;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A b E z Z";
		
		System.out.println(solution(s, 17));
	}
	
	private static String solution(String s, int n) {
		String answer = "";
		
		char[] cArr = s.toCharArray();
		
		for(int i = 0; i < cArr.length; i++) {
			if(cArr[i] != ' ') {
				Boolean bFlag = Character.isUpperCase(cArr[i]);
				if(bFlag == true) {
					if((int)cArr[i] + n > 90) {
						cArr[i] = (char)((int)cArr[i] - 26 + n);
					} else {
						cArr[i] = (char)((int)cArr[i] + n);
					}
				} else {
					if((int)cArr[i] + n > 122) {
						cArr[i] = (char)((int)cArr[i] - 26 + n);
					} else {
						cArr[i] = (char)((int)cArr[i] + n);
					}
				}
			}
		}
		
		for(int i = 0; i < cArr.length; i++) {
			answer+=cArr[i];
		}
		
		return answer;
	}
}
