package exam;

import java.io.IOException;
import java.io.InputStream;

public class InputMethod {
	
	public static void main(String[] args) {

		InputStream in = System.in;
		
		
		try {
			int a;
			a = in.read();
			System.out.println(a);
		} catch (IOException e) {e.printStackTrace();}
		 
		

	}

}


