package exam;

public class Array {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5};
		
		/* Array �迭 ���� methods
		   => arraycopy(), copyof(), clone()
		*/
		   
		//(1) arraycopy(�����迭, �ű�迭, ����)
		int[] newArr = new int[5];
		System.arraycopy(arr, 0, newArr, 0, arr.length);    
		   
		   
		   
		 

	}

}
