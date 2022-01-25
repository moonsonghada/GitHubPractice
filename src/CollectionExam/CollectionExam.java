package CollectionExam;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionExam {
	
	// Collection
	//  : 한정된 메모리 공간에서 데이터를 어떻게 잘 관리하고 저장하고 꺼낼 수 있는가를
	//    해결하기 위해 사용되는 자료구조 라이브러리
	//  : java에서 data를 저장하는 class들을 표준화한 설계구조
	
	/* 대표적인 종류
	 
	 1. List : 순서가 있는 data의 집합 
	      ex. ArrayList, LinkedList
	 2. Set : 순서가 없는 data의 집합, 중복x
	      ex. HashSet, LinkedHashSet
	 3. Map : Key와 Value의 쌍으로 이루어진 data의 집합
	 	 	  -> Key는 중복x
	 	 	  이건 앞으로 web에서 정말 많이 나옴
	 	 	  -> front-end에서도 계속 나오고 웹 크롤링 등 다양한 분야에서 많이 등장
	      
	 4. Collection Interface
	    : List, Set의 상위 interface
	    : Collection 안에 들어가는 data들은 모든 타입이 가능하지만
	      타입이 다른  경우, 일관된 처리가 어려워서 type parameter를 사용
	      (제네릭 Generic)  
	 */
	
	
	/* Collection object 생성
	    : Collection Class들은 java.util package가 포함하고 있음
	     생성방법에 따라 reference type variable 선언 시 상위 interface type 작성
	     객체 생성은 필요에 따라 구체적인 class들을 사용하는 형식
	 */
	
	public static void main(String[] args) {
		
		// 예시
		Collection<String> test1 = Arrays.asList("1", "2","3","4");
		Collection<String> test2 = Collections.singleton("Test2");
		
		// addAll(): 통채로 복사해서 추가
		Collection<String> test3 = new HashSet<>();
		test3.addAll(test1);
		
		// clear(): 모든 데이터 삭제
		// retainAll(a): a만 남기고 나머지 모두 삭제 
		
		
		// toArray() : Collection을 배열로 바꾸는 method
		String[] arr1 = test3.toArray(new String[test3.size()]);
		
		// ***** forEach() : 
		test3.forEach(a -> {System.out.println(a);});
		test3.forEach(System.out::println);
		
		// ***** Iterator
		// data에 접근하는 방법을 제공하는 interface
		// Collection interface가 상속받는 interface
		Iterator<String> iter = test3.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
