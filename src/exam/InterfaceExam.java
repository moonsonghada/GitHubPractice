package exam;

public class InterfaceExam {
	public static void main(String args[]) {
		DogA d = new DogA();
		System.out.println(d.jong);
		Doggiable.say();
		
		
		
	}
}
abstract class Doggy{
	Doggy(){
		
	}
}

interface Doggiable{
	public static final String a = "";
	public static final String jong = "Dog";
	public void bark(String sound);
	public static void say() {
		System.out.println("A");
	}
}

class DogA implements Doggiable{

	@Override
	public void bark(String sound) {
		System.out.println(sound);
	}
	
	
}