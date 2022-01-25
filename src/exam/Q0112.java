package exam;

import java.util.ArrayList;
import java.util.Arrays;

/*
숫자가 주어졌을 때(0포함) 숫자들을 이어 붙여 만들 수 있는 가장 큰 수를 찾는 문제입니다.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 
이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 find_biggest_num이 매개변수로 주어질 때, 
순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 
find_biggest 함수를 작성해주세요.

제한 사항
find_biggest_num의 길이는 1 이상 100,0 이하입니다.
find_biggest_num의 요소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
입출력 예
numbers	return
[6, 10, 2]	"6210"
[3, 30, 34, 5, 9]	"9534330"
 */

public class Q0112 {

	public static void main(String[] args) {
		// find_biggest method를 실행하기 위해 Q0112 class의 instance 생성
		Q0112 q = new Q0112();
		// find_biggest_num이라는 int[]를 받아서
		int[] find_biggest_num = {9, 5, 3, 55};
		// argument로 넣어줌
		// return 값이 int type이기 때문에 int answer로 받아서 print해줌
		int answer = q.find_biggest(find_biggest_num);
		System.out.println(answer);

	}
	
	public int find_biggest(int[] find_biggest_num) {
		
		/* 풀이 방법
		   (1) 가장 먼저 모든 값을 구하는 방법을 생각해보았을 것
		     => 하지만 이는 너무 비효율적인 방법
		     => 우리의 목표는 find_biggest 값을 return하는 것이기 때문
		   (2) 최대값만 찾기
		     => find_biggest_num 중에서 가장 숫자가 큰 것들을 순서대로 나열하면 됨
		 */
		
		// find_biggest_num의 각 값을 [a,b,c,d]의 형태로 넣는 array를 만듦
		int[][] dataOrganization = new int[find_biggest_num.length][4];
		
		// data_org라는 Array에 값을 대입
		for(int i=0; i<find_biggest_num.length; i++) {
			// 우선 find_biggest_num[i] 하나를 String으로 casting해줌
			String temp1 = Integer.toString(find_biggest_num[i]);
			// 빈칸은 공백으로 만들고 앞에서부터
			String temp2 = String.format("%-4s",temp1);
			// temp2를 split해서 array에 담아줌
			String[] temp3 = temp2.split("");
			// 이 String[]을 int[]로 바꿔야하기에 공백은 -1로 변환
			for(int x=0;x<4;x++) {
				if(temp3[x].equals(" ")) {
					temp3[x]="-10";
				}
			}
			// 이제 temp3을 int[]로 바꿔준 뒤 data_org[i]에 담아줌
			dataOrganization[i]=Arrays.stream(temp3).mapToInt(Integer::parseInt).toArray();
		}
		
		// 겹치는 걸 걍 다 만들어버리자
		// 그리고 그 후보들 중에서 sort를 해서 값을 꺼내보자
		ArrayList<String> answers = new ArrayList<>();
		
		// 실행하고 나면 answers에 후보들이 들어가 있을 것
		String now = "";
		choose(-1, dataOrganization, find_biggest_num, now, answers);
		
		// answers를 String[] 으로 바꾸고 그걸 다시 int[]로 바꾸자
		String[] temp = answers.toArray(new String[answers.size()]);
		int[] ansCand = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();
		// 그리고 그 배열을 정렬
		Arrays.sort(ansCand);
		
		// 오름차순으로 정렬되어 있기 때문에 맨 뒤의 값을 return하면 문제의 조건 충족
		int biggest_num = ansCand[ansCand.length-1];
		return biggest_num;
	}
	
	private void choose(int index, int[][] dataOrg, int[] find_biggest_num, String now, ArrayList<String> answers) {
		// 이미 사용된 index의 값은 -10으로 세팅해버림
		// 맨 끝이 아닌 맨 처음에 둔 이유는 재귀이기 때문
		if(index>=0) {
			dataOrg[index][0] = -10;
		}
		
		// 임의의 index와 value를 담는 variable
		int fstInd = -1;
		int fstVal = -1;
		// 가장 큰 값을 먼저 찾기
		for(int i=0;i<dataOrg.length;i++) {
			if(dataOrg[i][0]>fstVal) {
				fstInd = i;
				fstVal = dataOrg[i][0];
			}	
		}
		
		// 없다면 종료해야 할 시점 (전부 다 -10이라는 뜻이니까)
		if(fstInd==-1) {
			answers.add(now);
			return;
		}
		
		// 겹치는게 있는 경우
		for(int i=0;i<dataOrg.length;i++) {
			if(dataOrg[i][0]==fstVal) {
				String temp = now + find_biggest_num[i];
				// * 주의: 다중배열은 .clone()을 써도 깊은 복사가 되지 않는다! * 
				choose(i, deepClone(dataOrg), find_biggest_num, temp, answers);
			}	
		}
		return;
	}
	
	// 다차원배열의 깊은 복사를 위한 method
	private int[][] deepClone(int[][] mA) {
		int[][] dC = new int[mA.length][mA[0].length];
		for(int i=0; i<mA.length; i++){
			dC[i]=mA[i].clone();
		}
		return dC;
	}
}
