package ExceptionLec;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[] args) {
		// Exception class 은 Throwable class를 상속하고 있다.
		// (물론 Throwable class 자체를 이용할 일은 거의 없을 것)
		
		/* 자주 볼 수 있는 Error 종류
		   1. OutOfMemoryError
			 - JVM memory가 부족해서 instance 할당이 부족한 경우
			 - Garbage Collector가 memory를 사용할 수 없을 경우
		   2. StackOverFlowError
			 - memory의 허용한도를 초과해서 thread stack 크기가 커지는 경우
			  ex. 응용프로그램에서 재귀가 너무 깊어진 경우 
		*/
		
		/* 자주 볼 수 있는 Exception 종류
		   1. checked Excpetion
		    (1) IOException
		       - 입출력 관련 예외
		    (2) InterruptedException
		       - Thread 관련 예외
		   2. unchecked Exception
		    (1) RuntimeException
		       - try{}catch(){}를 강제로 선언하지 않아도 된다.
		    (2) NullPointerException
		       - 자료형 변수에 instance가 저장되어있지 않고 null이 들어있으면 발생 
		    	ex.	String a = null;
					System.out.println(a.isEmpty());
		    (3) ClassCastException
		       - 객체 타입 변환시 올바르지 않은 객체로 타입변환할 경우
		 */
		
		// 예외 발생 확인법
//		try {
//			int num = -1;
//			int[] arr = new int[3];
//			System.out.println(arr[num]);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("범위를 초과헀습니다");
//			//e.printStackTrace();
//			// Spring의 단골문법
//			// 이렇게 직접 에러를 띄워줘야 함, 현업에서는 WAS를 거치지 때문에 안 그러면 에러가 안 뜨고 넘어갈 수 있음  
//			// 이거 쓰고 바로 지워야 함 -> 보안감사 때 무조건 문제가 될 것
//			// 왜냐하면 이게 있으면 log 내역을 쉽게 볼 수 있기 때문
//			// e.printStackTrace() 는 필요할 때 쓰고 바로 바로 지우는 습관을 들이자
//			
//		}

		
		
		// 이 예제는 곰곰히 고민해보자!
		Scanner in = new Scanner(System.in);
		int a = 0;
		
		do {
			try {
				int value=in.nextInt();
				System.out.println(a);
			}catch(InputMismatchException e) {
				System.out.println("잘못입력");
				continue;
			}
			a++;
		}while(false);
		
		/* 예외처리시 고려해야 할 사항
		 -> 모든 예외를 체크하는 것은 힘들다
		 하지만 예외가 발생할 가능성이 높다고 생각되면?
		 -> RuntimeException class를 사용해서 예외에 대응하자
		 물론 가능하면 예외 종류별 적절한 Exception을 찾는 것이 가장 중요하다.
		*/
		
		
		// 예외를 customizing해보자 : throw
//		ExceptionTest ext = new ExceptionTest();
//		ext.setName("t");
		// 이렇게 직접 만든 Exception을 강제로 thorw할 수도 있음 
		
		
		
		// 자바에서 나누기 0을 하면 어떻게 될까?
		// => 에러
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
//				System.out.println("0으로 나눌 수 없습니다");
////				continue; // 이건 해도 안 해도 똑같다/
//			}
//			
//		}
		
		
		
		
		
		
		
	}

}
