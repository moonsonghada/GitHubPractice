package CollectionExam;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionExam {
	
	// Collection
	//  : ������ �޸� �������� �����͸� ��� �� �����ϰ� �����ϰ� ���� �� �ִ°���
	//    �ذ��ϱ� ���� ���Ǵ� �ڷᱸ�� ���̺귯��
	//  : java���� data�� �����ϴ� class���� ǥ��ȭ�� ���豸��
	
	/* ��ǥ���� ����
	 
	 1. List : ������ �ִ� data�� ���� 
	      ex. ArrayList, LinkedList
	 2. Set : ������ ���� data�� ����, �ߺ�x
	      ex. HashSet, LinkedHashSet
	 3. Map : Key�� Value�� ������ �̷���� data�� ����
	 	 	  -> Key�� �ߺ�x
	 	 	  �̰� ������ web���� ���� ���� ����
	 	 	  -> front-end������ ��� ������ �� ũ�Ѹ� �� �پ��� �о߿��� ���� ����
	      
	 4. Collection Interface
	    : List, Set�� ���� interface
	    : Collection �ȿ� ���� data���� ��� Ÿ���� ����������
	      Ÿ���� �ٸ�  ���, �ϰ��� ó���� ������� type parameter�� ���
	      (���׸� Generic)  
	 */
	
	
	/* Collection object ����
	    : Collection Class���� java.util package�� �����ϰ� ����
	     ��������� ���� reference type variable ���� �� ���� interface type �ۼ�
	     ��ü ������ �ʿ信 ���� ��ü���� class���� ����ϴ� ����
	 */
	
	public static void main(String[] args) {
		
		// ����
		Collection<String> test1 = Arrays.asList("1", "2","3","4");
		Collection<String> test2 = Collections.singleton("Test2");
		
		// addAll(): ��ä�� �����ؼ� �߰�
		Collection<String> test3 = new HashSet<>();
		test3.addAll(test1);
		
		// clear(): ��� ������ ����
		// retainAll(a): a�� ����� ������ ��� ���� 
		
		
		// toArray() : Collection�� �迭�� �ٲٴ� method
		String[] arr1 = test3.toArray(new String[test3.size()]);
		
		// ***** forEach() : 
		test3.forEach(a -> {System.out.println(a);});
		test3.forEach(System.out::println);
		
		// ***** Iterator
		// data�� �����ϴ� ����� �����ϴ� interface
		// Collection interface�� ��ӹ޴� interface
		Iterator<String> iter = test3.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
