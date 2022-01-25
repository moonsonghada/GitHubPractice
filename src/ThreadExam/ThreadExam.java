package ThreadExam;

public class ThreadExam {
	
	public static void main(String[] args) {
		
		// program = (n * (process = n * thread))
		
		// Thread
		// : ���μ��� ���� �ڿ��� ����� ����Ǵ� �帧�� ����
		
		// Process
		// : ���α׷��� ����� ����
		
		// ���α׷��� �ϳ� �Ǵ� �� �̻��� ���μ����� ��� �� �ִ�.
		// �Ϲ����� �ڹ� ���α׷��� �ϳ��� ���μ����� �ϳ��� ������� �
		
		// �ֱ� SW�� �� multi-thread�� ����ϴ� ��쵵 ����
		
		
		// cf. "ajax : �񵿱��� ó�� ���" �˾ƺ���
		
		
		// (1) ������ (Synchronized)
		//     : ���� �۾��� ����� ������ ��ٸ� �� ���� �۾��� �����ϴ� ��
		
		// (2) �񵿱��� (Asynchronized)
		//     : ���� ��ɸ� ������ ���� �۾��� �����ϴ� ��
		//       main thread�� 2���� thread�� �����ϰ� �� thread�� �����Ų ��
		
		
		// ������
		//  : �ش� ������ �����帧�� ���ÿ� ����ǰ� �ִ� ��
		
		
		// ��ǻ�ʹ� ���� ���� CPU�� ������ �� �ִ�!
		// CPU�� process(���α׷��� ����� ����)�� �ٷ�⿡ processor��� �Ѵ�
		// CPU�� ���� �� �����ϴ� ���: multi-processor
		// �ټ��� processor�� ���������� ���� ó���ϴ� �� : multi-processing
		
		// core�� �����ϴ� ���� : 0�� 1�� switching�ؼ� ������ ���� ����
		// -> �̰� clock
		// clock�� ���� ��: Hz
		//  ex. 2.8GHz : 1�� 28����� ����
		
		
		// �۾� �����ٸ�
		// : �۾��� �켱������ ������
		//   ex. FIFO, LIFO, ...... ��
		
		
		// HW Thread
		// : CPU�� core ���� thread�� ���Ѵ�
		//   1 core 1 thread , (SMT: �Ϲ�thread+����thread) 1 core 2 threads 
		
		// SW Thread
		// : kennel level thread, user level thread
		
		
		// java���� thread ���
		// : java8 ���� ����� ���� thread�� �� ��
		// : JVM�� ���� OS�κ��� system call�� ȣ���ؼ�
		//    kernel thread�� �Ҵ� ����
		//    (���� ������ ��ü�� ���� �ٸ�
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		});
		// start�ϸ� �������� �Ҵ� �޴� ��
		thread1.start();
		
		// ������ ������ ���� �� �ƴ�
		// => ��ȯ��� �߻�
		//    : HW thread�� �̿��� kernel thread�� �����ư��� ���ϸ�
		//      HW thread���� kernel thread�� �ɰ��鼭 cost�߻�
		
		
		
		useThread();
		
	}
	
	public static void useThread(){
		
		try {
			
			long startTime = System.currentTimeMillis();
			
			// Thread�� �ϴ� ��: Process�� ���� ���� thread�� ������ �۾�
			// ����ؾ� �� �۾��� �и��ص�
			ThreadCore task1 = new ThreadCore(0, 500000000);
			Thread thread1 = new Thread(task1);
			
			ThreadCore task2 = new ThreadCore(500000001, 1000000000);
			Thread thread2 = new Thread(task2);
			
			
			// �� Thread�� ����
			thread1.start();
			thread2.start();
			
			// ��� Thread�� ���� ������ ���
			thread1.join();
			thread2.join();
			
			// 
			System.out.println(task1.sum + task2.sum);
			
			
					
			long endTime =System.currentTimeMillis();
			System.out.println(endTime - startTime);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// ����� ���� �ð��� Ȯ �پ������� (�߸� �ٷ�� ���� ���)
		
	}
}

