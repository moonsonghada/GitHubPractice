package exam;

import java.util.Arrays;

public class Q0111_2 {

	/*
	��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
	��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� ��ȣ�� ��ȭ��ȣ�� ���λ��Դϴ�.

	������ : 119
	�ָ�� : 97 674 223
	����ȣ : 11 9552 4421
	��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 tel_list �� 
	list_of_tel �Լ��� �Ű������� �־��� ��, 
	� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� 
	�׷��� ������ true�� return �ϵ��� list_of_tel �Լ��� �ۼ����ּ���.

	���� ����
	tel_list ���̴� 1 �̻� 1,000,00 �����Դϴ�.
	�� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
	���� ��ȭ��ȣ�� �ߺ��ؼ� ������� �ʽ��ϴ�.
	����� ����
	tel_list							return
	{"119", "97674223", "1195524421"}	false
	{"123","456","789"}					true
	{"12","123","1235","567","88"}		false
	����� �� ����
	����� �� #1
	�տ��� ������ ���� �����ϴ�.

	����� �� #2
	�� ��ȣ�� �ٸ� ��ȣ�� ���λ��� ��찡 �����Ƿ�, ���� true�Դϴ�.

	����� �� #3
	ù ��° ��ȭ��ȣ, ��12���� �� ��° ��ȭ��ȣ ��123���� ���λ��Դϴ�. ���� ���� false�Դϴ�.
	*/
	
	public static void main(String[] args) {
		Q0111_2 aq = new Q0111_2();
		
		// ��ȭ��ȣ�� �迭
		String[] tel_list = {"12","123","1235","567","88"};
		
		
		boolean result = aq.list_of_tel(tel_list);
		System.out.println(result);
	}
	
	public boolean list_of_tel(String[] tel_list) {
		// �켱 sort���� ����
		Arrays.sort(tel_list);
		
		// 
		for(int i=0; i<tel_list.length-1; i++) {
			for(int j=i+1; j<tel_list.length;j++) {
				
				//tel_list[i], tel_list[j] ���� ��
				// �ϳ��� �ٸ��� 1, ��� ������ 0
				int right = 0;
				// ���� ���غ��ٰ� �ٸ��� break ��Ŵ
				// ������ ��� ����
				for(int temp=0;temp<tel_list[i].length();temp++) {
					if(tel_list[i].charAt(temp)!=tel_list[j].charAt(temp)) {
						right = 1;
						break;
					}
				}
				//0�̸� ���� �ٸ� ��
				if(right==0) {return false;}
				//true�̸� �̹� ���λ簡 �ִ� ���̴� return false;�ؼ� ������ ��
				else if(right==1) {break;}
			}
		}
		
		return true;
	}
	
}
