package LambdaExam;

class Test{
	public void testMethod() {
		System.out.println("Test");
	}
}

abstract class People{
	abstract public void eat();
	abstract public void sleep();
	
	void walk() {
		System.out.println("walk");
	}
}

interface Operate{
	int operator(int a, int b);
	
	default void print() {
		System.out.println("Test");
	}
}

class Cal {
	int a;
	int b;
	
	public Cal(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public int result(Operate op) {
		return op.operator(a,b);
	}
}


public class LambdaMain {

	public static void main(String[] args) {
		
		// ������ ���� ���
		Test test = new Test();
		test.testMethod();
		
		
		// �͸� Ŭ���� (�⺻)
		// : ��ӹ޴� class�� ������ java������ ���� class�� ����� ���� �ƴ϶�
		//   �ڵ� ���ο� �̸��� �������� �ʴ� class�� ����� ��
		
		// ex. Test class�� ��ӹ޴� anonymous class
		Test anTest = new Test() {
			@Override 
			public void testMethod() {
				System.out.println("�������̵� �Ϸ�");
			}
			
			public void serve() {
				System.out.println("����޼���!");
			}
		};
		// Anonymous Class ���� ����
		// - �ܺο��� ���ο� method ������ �Ұ���!
		//   (�������̵��� �ؼ� ����ؾ� ��)
		anTest.testMethod();
//		anTest.serve();
		
		
		// Anonymous Class�� ���� ����??
		// : abstract class�� interface ���� ����
		//   -> ������ ������ ��� anonymous class�� ó��
		//   -> �������� �ö� (���� ���� class�� ���� ����ϰ� ���� ����鵵 �ֱ� ��)
		//  (�ٸ� �ǹ������� �׷��� ������ �ڵ尡 ������ ����)
		
		
		
		// �͸�Ŭ���� (abstract class�� extends)
		People p1 = new People() {
			@Override
			public void eat() {
				// ����
			}
			@Override
			public void sleep() {
				// ����
			}
			
		};
		
		// interface�� �̿��ؼ� lambda �� ����
		Operate op = (a,b) -> {
			return a+b;
		};
		
		// ���� ǥ���� �������
		// 1. �������̽�
		// 2. �������̽��� �ϳ��� �߻� method�� ����
		//  (���� ���ٽ��� �߸� ����� �������̽��� ��� �þ�� ���� �߻�)
		
		
		
		// interface �� class�� ������ ���� ���ٷ� �ذ��ϱ�
		Cal c1 = new Cal(100,200);
		int result = c1.result((a,b)->{
			return a+b;
		});
		
	}

}
