package exam;

import java.util.Scanner;

public class Q0111_1 {
	/*
	 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'b'의 개수와 'i'의 개수를 비교해 같으면 True, 다르면 False를
	 * return 하는 chkChar를 완성하세요. 'b', 'i' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때
	 * 대문자와 소문자는 구별하지 않습니다.
	 * 
	 * 예를 들어 s가 "bBoooiI"면 true를 return하고 "Bii"라면 false를 return합니다.
	 * 
	 * 제한사항 문자열 s의 길이 : 50 이하의 자연수 문자열 s는 알파벳으로만 이루어져 있습니다. 입출력 예 s answer "bBoooiI"
	 * true "Bii" false 입출력 예 설명 입출력 예 #1 'b'의 개수 2개, 'i'의 개수 2개로 같으므로 true를 return
	 * 합니다.
	 * 
	 * 입출력 예 #2 'b'의 개수 1개, 'i'의 개수 2개로 다르므로 false를 return 합니다.
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Q0111_1 mq = new Q0111_1();
		
		System.out.println("알파벳으로만 이루어진 문자열을 입력하시오");
		String inputString = input.next();
		
		
		
		System.out.println(mq.chkChar(inputString));
		
	}
	
	public boolean chkChar(String s) {
		// b와 i의 개수를 보여주는 변수 선언
		int bNum = 0;
		int iNum = 0;
		
		// s를 split한 값을 가지는 String[] forChk라는 array 생성
		String[] forChk = s.split("");
		
		// 전체를 돌며 b, B와 같은 값이 있으면 bNum를 1 증가시키고
		// i, I와 같은 값이 있으면 iNum을 1 증가시킴
		for(String temp:forChk) {
			if(temp.equals("b")||temp.equals("B"))
				bNum++;
			if(temp.equals("i")||temp.equals("I"))
				iNum++;
		}
		
		// bNum과 iNum을 비교하고 return값을 정함
		if(bNum==iNum) {
			return true;
		}else{return false;}
	}


}
