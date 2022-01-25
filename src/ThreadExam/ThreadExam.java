package ThreadExam;

public class ThreadExam {
	
	public static void main(String[] args) {
		
		// program = (n * (process = n * thread))
		
		// Thread
		// : 프로세스 내의 자원을 사용해 실행되는 흐름의 단위
		
		// Process
		// : 프로그램이 실행된 상태
		
		// 프로그램은 하나 또는 그 이상의 프로세스로 운영할 수 있다.
		// 일반적인 자바 프로그램은 하나의 프로세스와 하나의 스레드로 운영
		
		// 최근 SW들 중 multi-thread를 사용하는 경우도 많음
		
		
		// cf. "ajax : 비동기적 처리 방식" 알아보기
		
		
		// (1) 동기적 (Synchronized)
		//     : 이전 작업이 종료될 때까지 기다린 후 다음 작업을 수행하는 것
		
		// (2) 비동기적 (Asynchronized)
		//     : 실행 명령만 내리고 다음 작업을 실행하는 것
		//       main thread가 2개의 thread를 생성하고 두 thread를 실행시킨 뒤
		
		
		// 병렬적
		//  : 해당 시점에 실행흐름이 동시에 실행되고 있는 것
		
		
		// 컴퓨터는 여러 개의 CPU가 존재할 수 있다!
		// CPU는 process(프로그램이 시행된 상태)를 다루기에 processor라고도 한다
		// CPU가 여러 개 존재하는 경우: multi-processor
		// 다수의 processor가 협력적으로 일을 처리하는 것 : multi-processing
		
		// core의 동작하는 원리 : 0과 1의 switching해서 전기적 진동 생성
		// -> 이걸 clock
		// clock의 진동 수: Hz
		//  ex. 2.8GHz : 1초 28억번의 진동
		
		
		// 작업 스케줄링
		// : 작업의 우선순위를 나눠줌
		//   ex. FIFO, LIFO, ...... 등
		
		
		// HW Thread
		// : CPU의 core 내부 thread를 뜻한다
		//   1 core 1 thread , (SMT: 일반thread+가상thread) 1 core 2 threads 
		
		// SW Thread
		// : kennel level thread, user level thread
		
		
		// java에서 thread 사용
		// : java8 이후 사용자 레벨 thread는 안 씀
		// : JVM을 통해 OS로부터 system call을 호출해서
		//    kernel thread를 할당 받음
		//    (내부 구조는 운운영체제 별로 다름
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		});
		// start하면 그제서야 할당 받는 것
		thread1.start();
		
		// 하지만 무작정 좋은 건 아님
		// => 전환비용 발생
		//    : HW thread를 이용해 kernel thread를 번갈아가면 일하면
		//      HW thread에서 kernel thread를 쪼개면서 cost발생
		
		
		
		useThread();
		
	}
	
	public static void useThread(){
		
		try {
			
			long startTime = System.currentTimeMillis();
			
			// Thread가 하는 일: Process를 여러 개의 thread로 나눠서 작업
			// 계산해야 할 작업을 분리해둠
			ThreadCore task1 = new ThreadCore(0, 500000000);
			Thread thread1 = new Thread(task1);
			
			ThreadCore task2 = new ThreadCore(500000001, 1000000000);
			Thread thread2 = new Thread(task2);
			
			
			// 각 Thread를 실행
			thread1.start();
			thread2.start();
			
			// 모든 Thread가 끝날 때까지 대기
			thread1.join();
			thread2.join();
			
			// 
			System.out.println(task1.sum + task2.sum);
			
			
					
			long endTime =System.currentTimeMillis();
			System.out.println(endTime - startTime);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 결과를 보면 시간이 확 줄어들어있음 (잘만 다루면 성능 향상)
		
	}
}

