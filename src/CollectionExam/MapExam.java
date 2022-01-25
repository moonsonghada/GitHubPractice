package CollectionExam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {
		
		/* Map
		    : key와 value 형태의 데이터 관리 interface
		  	  여러가지 Map method들을 가지고 있다.
		  	  
		  	****** HashMap
		  	: Spring Framework에서 굉장히 많이 사용된다!!!
		  	  꼭 기억하도록 하자!!
		  	  Map과 List를 변환해서 데이터 처리를 자주 함
		 */
		
		// ex. 이름과 생년월일을 입력받는다.
		Map<String, String> map1 = new HashMap<>();
		map1.put("박정원", "19971030");
		map1.put("김철수", "19991010");
		
		System.out.println(map1);
		
		// get(idx) : 특정 key에 해당하는 value를 가져옴
		System.out.println(map1.get("박정원"));
		// remove(idx) :  특정 key에 해당하는 data 삭제 (삭제하면서 그 value를 return함)
		
		// 중복된 key를 입력하면 data를 덮어쓰기 해버림
		map1.put("김철수", "19800202");
		
		
		// EntrySet : 순서x, but for반복문 허용
		// entrySet()
		for(Map.Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue()+entry.getClass());
		}
		
		// keySet(), values()
		System.out.println(map1.keySet());
		System.out.println(map1.values()); // return type이 Collection
		
		for(String s:map1.keySet()) {
			System.out.print(s);
		}
		System.out.println();
		
		
		// Map과 List의 연계 (Spring Framework 할 때 굉장히 자주 보게 될 형태)
		/* ex. 성적관리 프로그램
		     성적 목록을 가지는 List와 학생이름을 key로 하는 Map
		 */
		List<Integer> score = Arrays.asList(80, 90, 55, 60, 75);
		
		Map<String, List<Integer>> student = new HashMap<>();
		student.put("박정원", score);
		
		int total = 0;
		for(int i: student.get("박정원")) {
			total+=i;
		}
		System.out.println(total);
	}

}
