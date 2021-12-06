package com.level.one;

public class LongToArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			long lNum = 9054432112L;
			
			int[] answer = solution(lNum);
			
			for(int i : answer) {
				System.out.println(i);
			}
			
	}

	private static int[] solution(long lNum) {
		String s = String.valueOf(lNum);
        String[] sArr = s.split("");
        int index = sArr.length;
        
        int[] answer = new int[index];
        
        for(int i = 0; i < index; i++) {
            answer[i] = Integer.parseInt(sArr[index- 1 - i]);
        }
        
		return answer;
		
	}
	
}
