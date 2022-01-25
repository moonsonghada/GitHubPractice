package FirstTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class java_quiz1_박정원 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 요구사항1
		Random ran = new Random();
		int answer = ran.nextInt(26);
		
		// 요구사항2
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// 요구사항3
		int input;
//		System.out.println("값을 입력해주세요");
		do {
			input = Integer.parseInt(bf.readLine());
//			if(input==answer)
//				break;
//			System.out.println("틀렸습니다. 다시 입력해주세요.");
		}while(answer != input);
//		System.out.println("정답입니다. 프로그램이 종료됩니다.");
		
	}

}
