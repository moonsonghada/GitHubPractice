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
		
		// 보통의 생성 방법
		Test test = new Test();
		test.testMethod();
		
		
		// 익명 클래스 (기본)
		// : 상속받는 class를 별도의 java파일을 통해 class를 만드는 것이 아니라
		//   코드 내부에 이름이 존재하지 않는 class를 만드는 것
		
		// ex. Test class를 상속받는 anonymous class
		Test anTest = new Test() {
			@Override 
			public void testMethod() {
				System.out.println("오버라이딩 완료");
			}
			
			public void serve() {
				System.out.println("서브메서드!");
			}
		};
		// Anonymous Class 주의 사항
		// - 외부에서 새로운 method 생성은 불가능!
		//   (오버라이딩을 해서 사용해야 함)
		anTest.testMethod();
//		anTest.serve();
		
		
		// Anonymous Class의 존재 이유??
		// : abstract class와 interface 관리 편의
		//   -> 내용이 가벼울 경우 anonymous class로 처리
		//   -> 가독성도 올라감 (물론 따로 class를 만들어도 깔끔하게 보는 방법들도 있긴 함)
		//  (다만 실무에서는 그렇게 간단한 코드가 많지는 않음)
		
		
		
		// 익명클래스 (abstract class를 extends)
		People p1 = new People() {
			@Override
			public void eat() {
				// 내용
			}
			@Override
			public void sleep() {
				// 내용
			}
			
		};
		
		// interface를 이용해서 lambda 식 구현
		Operate op = (a,b) -> {
			return a+b;
		};
		
		// 람다 표현식 사용조건
		// 1. 인터페이스
		// 2. 인터페이스에 하나의 추상 method만 선언
		//  (따라서 람다식을 잘못 만들면 인터페이스가 계속 늘어나는 문제 발생)
		
		
		
		// interface 와 class를 연결한 것을 람다로 해결하기
		Cal c1 = new Cal(100,200);
		int result = c1.result((a,b)->{
			return a+b;
		});
		
	}

}
