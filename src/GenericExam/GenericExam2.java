package GenericExam;

import java.util.ArrayList;

public class GenericExam2 {

	public static void main(String[] args) {
		
		Box<Character> b = new Box<>();
		b.setItem('A');
		

	}

}


class Box<T>{
	// ****** generic���� static�� ����� �Ұ����ϴ�.
	// ��, �̷� ������ T��� type�� Ȱ������ �ʴ´ٸ� �����ϴ�.
	public static int a = 1;
	public static int b;
	
	
	T boxItem;
	ArrayList<T> list = new ArrayList<T>();
	// ......field�� ���� �����?
	
	// DAO�� �� ������ field���� getter/setter�� ��������
	// (����� DB�� �̸��� field�� �̸��� �����ϴ� ���� �߿�
	void setItem(T boxItem) {
		this.boxItem=boxItem;
	}
	T getItem() {
		return boxItem;
	}
	
	ArrayList<T> getList(){
		return list;
	}
}
