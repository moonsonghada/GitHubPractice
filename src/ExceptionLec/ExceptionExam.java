package ExceptionLec;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[] args) {
		// Exception class �� Throwable class�� ����ϰ� �ִ�.
		// (���� Throwable class ��ü�� �̿��� ���� ���� ���� ��)
		
		/* ���� �� �� �ִ� Error ����
		   1. OutOfMemoryError
			 - JVM memory�� �����ؼ� instance �Ҵ��� ������ ���
			 - Garbage Collector�� memory�� ����� �� ���� ���
		   2. StackOverFlowError
			 - memory�� ����ѵ��� �ʰ��ؼ� thread stack ũ�Ⱑ Ŀ���� ���
			  ex. �������α׷����� ��Ͱ� �ʹ� ����� ��� 
		*/
		
		/* ���� �� �� �ִ� Exception ����
		   1. checked Excpetion
		    (1) IOException
		       - ����� ���� ����
		    (2) InterruptedException
		       - Thread ���� ����
		   2. unchecked Exception
		    (1) RuntimeException
		       - try{}catch(){}�� ������ �������� �ʾƵ� �ȴ�.
		    (2) NullPointerException
		       - �ڷ��� ������ instance�� ����Ǿ����� �ʰ� null�� ��������� �߻� 
		    	ex.	String a = null;
					System.out.println(a.isEmpty());
		    (3) ClassCastException
		       - ��ü Ÿ�� ��ȯ�� �ùٸ��� ���� ��ü�� Ÿ�Ժ�ȯ�� ���
		 */
		
		// ���� �߻� Ȯ�ι�
//		try {
//			int num = -1;
//			int[] arr = new int[3];
//			System.out.println(arr[num]);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("������ �ʰ������ϴ�");
//			//e.printStackTrace();
//			// Spring�� �ܰ񹮹�
//			// �̷��� ���� ������ ������ ��, ���������� WAS�� ��ġ�� ������ �� �׷��� ������ �� �߰� �Ѿ �� ����  
//			// �̰� ���� �ٷ� ������ �� -> ���Ȱ��� �� ������ ������ �� ��
//			// �ֳ��ϸ� �̰� ������ log ������ ���� �� �� �ֱ� ����
//			// e.printStackTrace() �� �ʿ��� �� ���� �ٷ� �ٷ� ����� ������ ������
//			
//		}

		
		
		// �� ������ ������ ����غ���!
		Scanner in = new Scanner(System.in);
		int a = 0;
		
		do {
			try {
				int value=in.nextInt();
				System.out.println(a);
			}catch(InputMismatchException e) {
				System.out.println("�߸��Է�");
				continue;
			}
			a++;
		}while(false);
		
		/* ����ó���� ����ؾ� �� ����
		 -> ��� ���ܸ� üũ�ϴ� ���� �����
		 ������ ���ܰ� �߻��� ���ɼ��� ���ٰ� �����Ǹ�?
		 -> RuntimeException class�� ����ؼ� ���ܿ� ��������
		 ���� �����ϸ� ���� ������ ������ Exception�� ã�� ���� ���� �߿��ϴ�.
		*/
		
		
		// ���ܸ� customizing�غ��� : throw
//		ExceptionTest ext = new ExceptionTest();
//		ext.setName("t");
		// �̷��� ���� ���� Exception�� ������ thorw�� ���� ���� 
		
		
		
		// �ڹٿ��� ������ 0�� �ϸ� ��� �ɱ�?
		// => ����
//		Scanner in = new Scanner(System.in);
//		while(true) {
//			
//			int fir = in.nextInt();
//			int sec = in.nextInt();
//			
//			try {
//				int dev = fir/sec;
//				System.out.printf("%d / %d = %d%n",fir,sec,dev);
//			}catch(Exception e) {
//				System.out.println("0���� ���� �� �����ϴ�");
////				continue; // �̰� �ص� �� �ص� �Ȱ���/
//			}
//			
//		}
		
		
		
		
		
		
		
	}

}
