package exam;

public class StrFormatting {

	public static void main(String[] args) {
		// StrFormatting (문자열 안에 어떤 값을 삽입하는 방법)
		int money = 15000;
		System.out.println(String.format("I neeed %d", money));
		
		// 문자열 format 코드
		/* %s : String
		 * %c : char
		 * %d : int
		 * %f : float
		 * %o : 8진수
		 * %x : 16진수
		 * %% : % 
		 */
		
		System.out.println(String.format("%10s", "ab"));
		/* 길이가 10인 문자열 공간에서
		 * 우측 정렬하고 나머지는 공백
		 */
		
		System.out.println(String.format("%-10s", "ab"));
		/* 길이가 10인 문자열 공간에서
		 * 좌측 정렬하고 나머지는 공백
		 */
		
		System.out.printf("%-10s", "ab");
		// printf()는 println(String.format())과 비슷한 것!!!
		// 물론 return하는지 출력만 하는지의 차이는 있음
		
	}

}
