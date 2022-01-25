package FirstTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Shape{
	
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	private double area;
	private final double PI=3.141592;
	
	// ������ (constructor)
	public Shape() {
		this.area=0.0;
	}
	
	private void circle() throws NumberFormatException, IOException {
		System.out.println("**** ���� ���� ****");
		System.out.print("������ : ");
		double radius = Double.parseDouble(bf.readLine());
		area = radius*radius*PI;
		output();
	}
	
	private void triangle() throws NumberFormatException, IOException {
		System.out.println("**** �ﰢ���� ���� ****");
		System.out.print("�� �� : ");
		double base = Double.parseDouble(bf.readLine());
		System.out.print("�� �� : ");
		double height = Double.parseDouble(bf.readLine());
		area = base*height/2;
		output();
	}
	
	private void trape() throws NumberFormatException, IOException {
		System.out.println("**** ��ٸ����� ���� ****");
		System.out.print("�Ʒ��� : ");
		double base = Double.parseDouble(bf.readLine());
		System.out.print("�� �� : ");
		double top = Double.parseDouble(bf.readLine());
		System.out.print("�� �� : ");
		double height = Double.parseDouble(bf.readLine());
		area = (top+base)*height/2;
		output();
	}
	
	// ��� �Լ�
	private void output() {
		System.out.println("���� : "+area);
	}
	
	public int menu() throws NumberFormatException, IOException {
		
		
		System.out.println("***��������***");
		System.out.println("1. �ﰢ��");
		System.out.println("2. ��");
		System.out.println("3. ��ٸ���");
		System.out.print("���� : ");
		
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




public class java_quiz3_������ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Shape shape = new Shape();
		shape.menu();

	}

}