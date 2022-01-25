package GenericExam;

import java.util.ArrayList;

public class GenericExam2 {

	public static void main(String[] args) {
		
		Box<Character> b = new Box<>();
		b.setItem('A');
		

	}

}


class Box<T>{
	// ****** generic에서 static은 사용이 불가능하다.
	// 단, 이런 식으로 T라는 type을 활용하지 않는다면 가능하다.
	public static int a = 1;
	public static int b;
	
	
	T boxItem;
	ArrayList<T> list = new ArrayList<T>();
	// ......field가 여러 개라면?
	
	// DAO가 이 수많은 field들의 getter/setter를 관리해줌
	// (참고로 DB의 이름과 field의 이름을 통일하는 것이 중요
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
