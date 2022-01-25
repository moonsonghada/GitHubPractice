package LambdaExam;

import java.util.Arrays;

public class LambdaExam {
	public static void main(String[] args) {
		
		// js는 함수형 프로그래밍 (물론 객체지향도 지원은 함)
		// java는 객체지향 프로그래밍
		
		// * 함수형 프로그래밍
		//  : 순수함수와 공유상태, 변경가능한 데이터, 부작용을 피하는 기본 원칙에 따른 프로그래밍 방식
		//  : 동작하는 부분을 최소화해서 이해
		//  : 선언적 방식으로 구현
		//  : JS의 경우 함수는 객체 취급을 받는다!!
		
		// * 객체지향 프로그래밍
		//  : 동작하는 부분을 캡슐화해서 이해
		
		// * 1급객체 (1급함수)
		//   : 함수형 프로그래밍의 전제조건
		//    (1) 변수, 데이터 구조에 넣을 수 있음
		//    (2) parameter로 전달이 가능
		//    (3) return value로 사용할 수 있음
		
		
		
		// Lambda : 익명 함수
		// - 1.8ver 이후부터 사용 가능
		// - 최신 언어에서 샤용되는 식 중 하나
		// - 함수형 언어의 특징으로부터 파생되었음
		// - 람다의 경우, 표현을 간략하게 해서 필요한 정보만 사용
		// - 불필요한 loop 삭제 가능
		// - 병렬처리에 유리 (람다의 형태 자체가 다중 CPU를 활용하는 형태
		
		// 단점
		// - 남용하면 코드의 가독성이 급감
		// - 람다식이 단순히 모든 요소를 순회시 느릴 수 있음
		// - 디버깅이 어려움
		
		// 람다식 작성
		// (parameter) -> {함수 내용}
		
		// method를 Lambda식으로 바꿔보기
		LambdaTest t = () -> {System.out.println("test");};
		t.tes();
		
	}
	
	interface LambdaTest {
		public void tes();
	}
}
