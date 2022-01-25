package exam;

public class StrBuffer {

	public static void main(String[] args) {
		
		/* StringBuffer
		   => 문자열을 "추가하거나 변경할 때" 주로 사용하는 자료형
		   : literal 형태로는 잘 안 씀
		   : 문자 추가 시 객체를 따로 생성 X, 메모리 사용에서 이득을 가질 수 있음 */
		
		/* StringBuffer의 모순
		   => 자료형 크기 자체가 무거움 (String의 2배)*/ 
		
		/* String과 StringBuffer는 장단점을 알고 상황에 맞게 써야 함
		   => StringBuffer: 변경 많을 때
		   => String: 변경 작업 거의 없을 때
		   
		   
		   */
		
		/* 퀴즈
		   다음 문장을 출력해보세요 (방법은 자유롭게)
		   hello 2022 java web devTeam */
		StringBuffer sb = new StringBuffer();
		sb.append("hello 2022 ");
		sb.append("java web devTeam");
		String result = sb.toString();
		System.out.println(result);
		
		
	}

}
