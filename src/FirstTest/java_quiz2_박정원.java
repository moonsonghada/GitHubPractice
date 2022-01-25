package FirstTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_quiz2_박정원 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("정수 값을 하나 입력하시오");
		int a = Integer.parseInt(bf.readLine());
//		System.out.println("정수 값을 하나 더 입력하시오");
		int b = Integer.parseInt(bf.readLine());
		
		System.out.println(return_add(a,b));
	}
	
	public static int return_add(int a, int b) {	
		// 요구 사항 1 
		if(a==b) {return a;}
		// 요구 사항 2
		else if(a>b) {
			int tmp;
			tmp=a;
			a=b;
			b=tmp;
		}
		
		return (a+b)*(b-a+1)/2;
	}
}
