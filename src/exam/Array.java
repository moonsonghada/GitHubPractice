package exam;

public class Array {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5};
		
		/* Array 배열 복사 methods
		   => arraycopy(), copyof(), clone()
		*/
		   
		//(1) arraycopy(기존배열, 옮길배열, 범위)
		int[] newArr = new int[5];
		System.arraycopy(arr, 0, newArr, 0, arr.length);    
		   
		   
		   
		 

	}

}
