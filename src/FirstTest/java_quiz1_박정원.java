package FirstTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class java_quiz1_������ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// �䱸����1
		Random ran = new Random();
		int answer = ran.nextInt(26);
		
		// �䱸����2
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// �䱸����3
		int input;
//		System.out.println("���� �Է����ּ���");
		do {
			input = Integer.parseInt(bf.readLine());
//			if(input==answer)
//				break;
//			System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���.");
		}while(answer != input);
//		System.out.println("�����Դϴ�. ���α׷��� ����˴ϴ�.");
		
	}

}
