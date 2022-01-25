package ExceptionLec;

public class ExceptionTest {
	String name;
	
	public void setName(String name) throws CustomException {

		throw new CustomException();

	}
}
