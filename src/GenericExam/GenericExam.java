package GenericExam;

import java.util.ArrayList;
import java.util.List;

public class GenericExam {

	public static void main(String[] args) {
		// Generic <>
		
		// 정의
		// : parameter를 받아올 때 정상적인 타입인지 체크해주는 도구
		
		// 목적
		// : 파일의 안정성
		//   고정된 data를 다루는 code에서는 상관없지만
		//   실행과정에서 동적으로 전달되는 객체를 참조해야 할 때 잘못된 타입이 전달되면
		//   심각해진다.
		
		GenericTest<String> gen1 = new GenericTest<>();
		gen1.setItem("test1");
		System.out.println(gen1.getItem());
		
		GenericTest<Integer> gen2 = new GenericTest<>();
		gen2.setItem(12345678);
		
		// **** 이거 열심히 연구해보자!!!!
		System.out.println(gen2.convert(gen2));
		System.out.println(gen1.convert(gen1));
		
		
	}

}

// generic class를 직접 만들어보자
// + generic은 일반적으로 T, E 이런 식으로 대문자 하나만 적어준다.
class GenericTest<T>{
	// T는 객체타입만 가능
	// T는 instance 변수로 간주된다
	// so, static에는 사용 불가능
	// generic arrya 생성 불가능!
	// new, instanceOf 연산자는 T를 피연산자로 사용 불가능!
	
	T item;
	
	// 위 navigation bar에서 source에 보면 getter/setter가 있음

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	// <?>를 하면 어떤 값이 들어와도 된다는 뜻
	// 즉, ? = Object
	// 자유도가 올라감
	// 다만, overloading에서 어려움이 생김
	public void print(GenericTest<?> gen) {
		
	}
	
	
	// Spring의 Controller가 이런 형태로 되어있음
	public <T> List<Character> convert(GenericTest<T> gen){
		ArrayList<Character> list =new ArrayList<>();
		
		// item을 String type의 ch로 바꿔줌
		String ch = String.valueOf(gen.getItem());
		
		for(int i=0; i<ch.length(); i++) {
			list.add(ch.charAt(i));
		}
		
		return list;
	}
}