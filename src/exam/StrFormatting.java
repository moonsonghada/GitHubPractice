package exam;

public class StrFormatting {

	public static void main(String[] args) {
		// StrFormatting (���ڿ� �ȿ� � ���� �����ϴ� ���)
		int money = 15000;
		System.out.println(String.format("I neeed %d", money));
		
		// ���ڿ� format �ڵ�
		/* %s : String
		 * %c : char
		 * %d : int
		 * %f : float
		 * %o : 8����
		 * %x : 16����
		 * %% : % 
		 */
		
		System.out.println(String.format("%10s", "ab"));
		/* ���̰� 10�� ���ڿ� ��������
		 * ���� �����ϰ� �������� ����
		 */
		
		System.out.println(String.format("%-10s", "ab"));
		/* ���̰� 10�� ���ڿ� ��������
		 * ���� �����ϰ� �������� ����
		 */
		
		System.out.printf("%-10s", "ab");
		// printf()�� println(String.format())�� ����� ��!!!
		// ���� return�ϴ��� ��¸� �ϴ����� ���̴� ����
		
	}

}
