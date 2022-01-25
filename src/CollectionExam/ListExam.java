package CollectionExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ListExam {

	public static void main(String[] args) {
		
		/* List�� �ֿ� methods
		    get(idx)
		    indexOf(value)
		    lastIndexOf(value) : value�� index�� ���������� ã�Ƽ�
		    listIterator() : List ��ü�� �����ϴ� ListIterator�� return
		    remove(idx) : ���� �� �� �� return
		    set(idx, value) : ������ ��ġ�� ��ü�� ����
		    sort() : ������ ������ List ��Ҹ� ����
		    sublist() : ������ ������ �ִ� ��ü�� ���ο� List�� return
		*/
		
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		int n = list1.lastIndexOf("c");
		
		
		List<String> l1 = new ArrayList<>();
		List<String> l2 = Arrays.asList("��", "��", "��");
		List<String> l3 = List.of("�ϳ�", "��", "��");
		// ���� ������
		List<Integer> l4 = List.of(1,2,3,4,5,6, 7, 8 ,9);
		System.out.println(l4);
		//l4.set(0, 99999); //�Ұ���
		//System.out.println(l4);
		String[] arr = {"a","b","c","d"};
		
		// listIterator();
		// -> ListIterator()�� �������
		/* Iterator iter = collectionInstance.iterator();
		 * while(iter.hasNext()){
		 *     System.out.println(iter.next());
		 * }
		 */
		// Iterator vs ListIterator ������
		// -> Collection�� ��� ���ٽ� �� ���� �̵��� ������ ���� ����
		//    ����� ��ü, �߰�, �˻� �� ��� �߰�
		//    ex. hasPrevious(), nextIndex(), previous(), previousIndex(), set(e)
		
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1); al.add(2); al.add(3); al.add(4);
		// sort()
		Collections.sort(al);
		System.out.println(al);
		// sort()�� �̿��ؼ� �������� �����
		Collections.reverse(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
	}

}
