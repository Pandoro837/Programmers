package com.level.one;

import java.util.Arrays;
import java.util.Collections;

public class LongDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long lNum = 5151232323L;
		
		System.out.println(solution(lNum));
		
	}

	private static long solution(long lNum) {
		long answer = 0;
		
		String s = String.valueOf(lNum);
		String[] sArr = s.split("");
		
		Arrays.sort(sArr, Collections.reverseOrder());
		
		String sAnswer = "";
		
		for(int i = 0; i < sArr.length; i++) {
			sAnswer+= sArr[i];
		}
		
		answer = Long.parseLong(sAnswer);
		
		return answer;
	}
}
