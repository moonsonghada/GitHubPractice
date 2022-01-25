package exam;

import java.util.Scanner;

public class Q0111_1 {
	/*
	 * �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'b'�� ������ 'i'�� ������ ���� ������ True, �ٸ��� False��
	 * return �ϴ� chkChar�� �ϼ��ϼ���. 'b', 'i' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� ��
	 * �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
	 * 
	 * ���� ��� s�� "bBoooiI"�� true�� return�ϰ� "Bii"��� false�� return�մϴ�.
	 * 
	 * ���ѻ��� ���ڿ� s�� ���� : 50 ������ �ڿ��� ���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�. ����� �� s answer "bBoooiI"
	 * true "Bii" false ����� �� ���� ����� �� #1 'b'�� ���� 2��, 'i'�� ���� 2���� �����Ƿ� true�� return
	 * �մϴ�.
	 * 
	 * ����� �� #2 'b'�� ���� 1��, 'i'�� ���� 2���� �ٸ��Ƿ� false�� return �մϴ�.
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Q0111_1 mq = new Q0111_1();
		
		System.out.println("���ĺ����θ� �̷���� ���ڿ��� �Է��Ͻÿ�");
		String inputString = input.next();
		
		
		
		System.out.println(mq.chkChar(inputString));
		
	}
	
	public boolean chkChar(String s) {
		// b�� i�� ������ �����ִ� ���� ����
		int bNum = 0;
		int iNum = 0;
		
		// s�� split�� ���� ������ String[] forChk��� array ����
		String[] forChk = s.split("");
		
		// ��ü�� ���� b, B�� ���� ���� ������ bNum�� 1 ������Ű��
		// i, I�� ���� ���� ������ iNum�� 1 ������Ŵ
		for(String temp:forChk) {
			if(temp.equals("b")||temp.equals("B"))
				bNum++;
			if(temp.equals("i")||temp.equals("I"))
				iNum++;
		}
		
		// bNum�� iNum�� ���ϰ� return���� ����
		if(bNum==iNum) {
			return true;
		}else{return false;}
	}


}
