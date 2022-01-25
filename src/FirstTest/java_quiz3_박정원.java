package FirstTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Shape{
	
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	private double area;
	private final double PI=3.141592;
	
	// 생성자 (constructor)
	public Shape() {
		this.area=0.0;
	}
	
	private void circle() throws NumberFormatException, IOException {
		System.out.println("**** 원의 넓이 ****");
		System.out.print("반지름 : ");
		double radius = Double.parseDouble(bf.readLine());
		area = radius*radius*PI;
		output();
	}
	
	private void triangle() throws NumberFormatException, IOException {
		System.out.println("**** 삼각형의 넓이 ****");
		System.out.print("밑 변 : ");
		double base = Double.parseDouble(bf.readLine());
		System.out.print("밑 변 : ");
		double height = Double.parseDouble(bf.readLine());
		area = base*height/2;
		output();
	}
	
	private void trape() throws NumberFormatException, IOException {
		System.out.println("**** 사다리꼴의 넓이 ****");
		System.out.print("아랫변 : ");
		double base = Double.parseDouble(bf.readLine());
		System.out.print("윗 변 : ");
		double top = Double.parseDouble(bf.readLine());
		System.out.print("높 이 : ");
		double height = Double.parseDouble(bf.readLine());
		area = (top+base)*height/2;
		output();
	}
	
	// 출력 함수
	private void output() {
		System.out.println("넓이 : "+area);
	}
	
	public int menu() throws NumberFormatException, IOException {
		
		
		System.out.println("***도형선택***");
		System.out.println("1. 삼각형");
		System.out.println("2. 원");
		System.out.println("3. 사다리꼴");
		System.out.print("선택 : ");
		
		int choose = Integer.parseInt(bf.readLine());
		
		switch(choose) {
		case 1:
			triangle();
			break;
		case 2:
			circle();
			break;
		case 3:
			trape();
			break;
		}
		
		return choose;
	}
}




public class java_quiz3_박정원 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Shape shape = new Shape();
		shape.menu();

	}

}