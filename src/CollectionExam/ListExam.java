package CollectionExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ListExam {

	public static void main(String[] args) {
		
		/* List의 주요 methods
		    get(idx)
		    indexOf(value)
		    lastIndexOf(value) : value를 index의 마지막부터 찾아서
		    listIterator() : List 객체에 접근하는 ListIterator를 return
		    remove(idx) : 삭제 후 그 값 return
		    set(idx, value) : 지정된 위치에 객체를 저장
		    sort() : 지정된 값으로 List 요소를 정렬
		    sublist() : 지정된 범위에 있는 객체를 새로운 List로 return
		*/
		
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		int n = list1.lastIndexOf("c");
		
		
		List<String> l1 = new ArrayList<>();
		List<String> l2 = Arrays.asList("일", "이", "삼");
		List<String> l3 = List.of("하나", "둘", "셋");
		// 둘의 차이점
		List<Integer> l4 = List.of(1,2,3,4,5,6, 7, 8 ,9);
		System.out.println(l4);
		//l4.set(0, 99999); //불가능
		//System.out.println(l4);
		String[] arr = {"a","b","c","d"};
		
		// listIterator();
		// -> ListIterator()를 만들어줌
		/* Iterator iter = collectionInstance.iterator();
		 * while(iter.hasNext()){
		 *     System.out.println(iter.next());
		 * }
		 */
		// Iterator vs ListIterator 차이점
		// -> Collection의 요소 접근시 한 방향 이동만 가능한 점을 보완
		//    요소의 대체, 추가, 검색 등 기능 추가
		//    ex. hasPrevious(), nextIndex(), previous(), previousIndex(), set(e)
		
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1); al.add(2); al.add(3); al.add(4);
		// sort()
		Collections.sort(al);
		System.out.println(al);
		// sort()를 이용해서 내림차순 만들기
		Collections.reverse(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
	}

}
