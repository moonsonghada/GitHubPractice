package FirstTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_quiz2_������ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("���� ���� �ϳ� �Է��Ͻÿ�");
		int a = Integer.parseInt(bf.readLine());
//		System.out.println("���� ���� �ϳ� �� �Է��Ͻÿ�");
		int b = Integer.parseInt(bf.readLine());
		
		System.out.println(return_add(a,b));
	}
	
	public static int return_add(int a, int b) {	
		// �䱸 ���� 1 
		if(a==b) {return a;}
		// �䱸 ���� 2
		else if(a>b) {
			int tmp;
			tmp=a;
			a=b;
			b=tmp;
		}
		
		return (a+b)*(b-a+1)/2;
	}
}
