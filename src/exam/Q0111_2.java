package exam;

import java.util.Arrays;

public class Q0111_2 {

	/*
	전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
	전화번호가 다음과 같을 경우, 구조대 전화번호는 재호의 전화번호의 접두사입니다.

	구조대 : 119
	최명우 : 97 674 223
	김재호 : 11 9552 4421
	전화번호부에 적힌 전화번호를 담은 배열 tel_list 이 
	list_of_tel 함수의 매개변수로 주어질 때, 
	어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 
	그렇지 않으면 true를 return 하도록 list_of_tel 함수를 작성해주세요.

	제한 사항
	tel_list 길이는 1 이상 1,000,00 이하입니다.
	각 전화번호의 길이는 1 이상 20 이하입니다.
	같은 전화번호가 중복해서 들어있지 않습니다.
	입출력 예제
	tel_list							return
	{"119", "97674223", "1195524421"}	false
	{"123","456","789"}					true
	{"12","123","1235","567","88"}		false
	입출력 예 설명
	입출력 예 #1
	앞에서 설명한 예와 같습니다.

	입출력 예 #2
	한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.

	입출력 예 #3
	첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.
	*/
	
	public static void main(String[] args) {
		Q0111_2 aq = new Q0111_2();
		
		// 전화번호부 배열
		String[] tel_list = {"12","123","1235","567","88"};
		
		
		boolean result = aq.list_of_tel(tel_list);
		System.out.println(result);
	}
	
	public boolean list_of_tel(String[] tel_list) {
		// 우선 sort부터 해줌
		Arrays.sort(tel_list);
		
		// 
		for(int i=0; i<tel_list.length-1; i++) {
			for(int j=i+1; j<tel_list.length;j++) {
				
				//tel_list[i], tel_list[j] 비교할 것
				// 하나라도 다르면 1, 모두 같으면 0
				int right = 0;
				// 둘을 비교해보다가 다르면 break 시킴
				// 같으면 계속 진행
				for(int temp=0;temp<tel_list[i].length();temp++) {
					if(tel_list[i].charAt(temp)!=tel_list[j].charAt(temp)) {
						right = 1;
						break;
					}
				}
				//0이면 둘은 다른 것
				if(right==0) {return false;}
				//true이면 이미 접두사가 있는 것이니 return false;해서 끝내도 됨
				else if(right==1) {break;}
			}
		}
		
		return true;
	}
	
}
