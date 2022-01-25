package CollectionExam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {
		
		/* Map
		    : key�� value ������ ������ ���� interface
		  	  �������� Map method���� ������ �ִ�.
		  	  
		  	****** HashMap
		  	: Spring Framework���� ������ ���� ���ȴ�!!!
		  	  �� ����ϵ��� ����!!
		  	  Map�� List�� ��ȯ�ؼ� ������ ó���� ���� ��
		 */
		
		// ex. �̸��� ��������� �Է¹޴´�.
		Map<String, String> map1 = new HashMap<>();
		map1.put("������", "19971030");
		map1.put("��ö��", "19991010");
		
		System.out.println(map1);
		
		// get(idx) : Ư�� key�� �ش��ϴ� value�� ������
		System.out.println(map1.get("������"));
		// remove(idx) :  Ư�� key�� �ش��ϴ� data ���� (�����ϸ鼭 �� value�� return��)
		
		// �ߺ��� key�� �Է��ϸ� data�� ����� �ع���
		map1.put("��ö��", "19800202");
		
		
		// EntrySet : ����x, but for�ݺ��� ���
		// entrySet()
		for(Map.Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue()+entry.getClass());
		}
		
		// keySet(), values()
		System.out.println(map1.keySet());
		System.out.println(map1.values()); // return type�� Collection
		
		for(String s:map1.keySet()) {
			System.out.print(s);
		}
		System.out.println();
		
		
		// Map�� List�� ���� (Spring Framework �� �� ������ ���� ���� �� ����)
		/* ex. �������� ���α׷�
		     ���� ����� ������ List�� �л��̸��� key�� �ϴ� Map
		 */
		List<Integer> score = Arrays.asList(80, 90, 55, 60, 75);
		
		Map<String, List<Integer>> student = new HashMap<>();
		student.put("������", score);
		
		int total = 0;
		for(int i: student.get("������")) {
			total+=i;
		}
		System.out.println(total);
	}

}
