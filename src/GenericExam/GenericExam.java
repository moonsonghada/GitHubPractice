package GenericExam;

import java.util.ArrayList;
import java.util.List;

public class GenericExam {

	public static void main(String[] args) {
		// Generic <>
		
		// ����
		// : parameter�� �޾ƿ� �� �������� Ÿ������ üũ���ִ� ����
		
		// ����
		// : ������ ������
		//   ������ data�� �ٷ�� code������ ���������
		//   ����������� �������� ���޵Ǵ� ��ü�� �����ؾ� �� �� �߸��� Ÿ���� ���޵Ǹ�
		//   �ɰ�������.
		
		GenericTest<String> gen1 = new GenericTest<>();
		gen1.setItem("test1");
		System.out.println(gen1.getItem());
		
		GenericTest<Integer> gen2 = new GenericTest<>();
		gen2.setItem(12345678);
		
		// **** �̰� ������ �����غ���!!!!
		System.out.println(gen2.convert(gen2));
		System.out.println(gen1.convert(gen1));
		
		
	}

}

// generic class�� ���� ������
// + generic�� �Ϲ������� T, E �̷� ������ �빮�� �ϳ��� �����ش�.
class GenericTest<T>{
	// T�� ��üŸ�Ը� ����
	// T�� instance ������ ���ֵȴ�
	// so, static���� ��� �Ұ���
	// generic arrya ���� �Ұ���!
	// new, instanceOf �����ڴ� T�� �ǿ����ڷ� ��� �Ұ���!
	
	T item;
	
	// �� navigation bar���� source�� ���� getter/setter�� ����

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	// <?>�� �ϸ� � ���� ���͵� �ȴٴ� ��
	// ��, ? = Object
	// �������� �ö�
	// �ٸ�, overloading���� ������� ����
	public void print(GenericTest<?> gen) {
		
	}
	
	
	// Spring�� Controller�� �̷� ���·� �Ǿ�����
	public <T> List<Character> convert(GenericTest<T> gen){
		ArrayList<Character> list =new ArrayList<>();
		
		// item�� String type�� ch�� �ٲ���
		String ch = String.valueOf(gen.getItem());
		
		for(int i=0; i<ch.length(); i++) {
			list.add(ch.charAt(i));
		}
		
		return list;
	}
}