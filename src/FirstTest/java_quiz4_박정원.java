package FirstTest;

public class java_quiz4_������ {

	public static void main(String[] args) {
		
		App_By_stack stack = new App_By_stack(2);
		
		stack.print();

		System.out.println("length(): "+stack.length());
		System.out.println("���� ����: "+stack.capacity());
		System.out.println("capacity(): "+stack.capacity());
		
		System.out.println(stack.push("1.1"));
		System.out.println(stack.push("1.2"));
		System.out.println(stack.push("1.3"));
		System.out.println(stack.push("1.4"));
		System.out.println(stack.push("1.5"));
		
		stack.print();
		
		System.out.println("length(): "+stack.length());
		System.out.println("���� ����: "+stack.capacity());
		System.out.println("capacity(): "+stack.capacity());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		stack.print();
		
		System.out.println("length(): "+stack.length());
		System.out.println("���� ����: "+stack.capacity());
		System.out.println("capacity(): "+stack.capacity());
		
	}

}



interface Make_Stack {
	public int length();
	public int capacity();
	public String pop();
	public boolean push(String v);
}



class App_By_stack implements Make_Stack{
	
	private Double[] arr;
	private int top = 0;
	
	// �Է¹��� ���� ������ arr[]�� ����� �� 
	public App_By_stack(int size) {
		arr = new Double[size];
	}
	
	@Override
	public int length() {
		return top;
	}

	@Override
	public int capacity() {
		return arr.length;
	}
	
	public int left() {
		if(arr.length-top>0) {
			return arr.length-top;
		}else {return 0;}
	}

	@Override
	public String pop() {
		if(top>0) {
			top--;
			Double tmp = arr[top]; 
			arr[top]=null;
			return Double.toString(tmp);
		}
		return "�� �̻� ���� �����ϴ�.";
	}

	@Override
	public boolean push(String v) {
		if(top<arr.length) {
			arr[top]=Double.parseDouble(v);
			top++;
			return true;
		}
		return false;
	}
	
	public void print() {
		System.out.print("arr: ");
		for(Double tmp:arr)
			if(tmp!=null)
				System.out.print(tmp+"  ");
		System.out.println();
	}
	
}