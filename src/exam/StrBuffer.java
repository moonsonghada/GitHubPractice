package exam;

public class StrBuffer {

	public static void main(String[] args) {
		
		/* StringBuffer
		   => ���ڿ��� "�߰��ϰų� ������ ��" �ַ� ����ϴ� �ڷ���
		   : literal ���·δ� �� �� ��
		   : ���� �߰� �� ��ü�� ���� ���� X, �޸� ��뿡�� �̵��� ���� �� ���� */
		
		/* StringBuffer�� ���
		   => �ڷ��� ũ�� ��ü�� ���ſ� (String�� 2��)*/ 
		
		/* String�� StringBuffer�� ������� �˰� ��Ȳ�� �°� ��� ��
		   => StringBuffer: ���� ���� ��
		   => String: ���� �۾� ���� ���� ��
		   
		   
		   */
		
		/* ����
		   ���� ������ ����غ����� (����� �����Ӱ�)
		   hello 2022 java web devTeam */
		StringBuffer sb = new StringBuffer();
		sb.append("hello 2022 ");
		sb.append("java web devTeam");
		String result = sb.toString();
		System.out.println(result);
		
		
	}

}
