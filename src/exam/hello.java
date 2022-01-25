package exam;

public class hello {
	
	public static void main(String[] args) {
		System.out.println("Hello JAVA World!");
		
		// 변수명 설정 규칙
		// => $ _ 처음 가능
		
		// 가능하면 선언하는 변수 수는 적게
		// because RAM 구조상 변수 수가 많아지면 search 속도가 느려짐
		
		// int: -2^31~2^31-1 (-21억~21억)
		// 문자열 변수
		// => StringBuffer vs String
		// String: 1byte
		
		int a = 4;
		int b = 3;
		a+=3;
		System.out.println(a);
	}
	
}
