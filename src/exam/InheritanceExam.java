package exam;

public class InheritanceExam {
	
}

class Dog{
	String color;
	Dog(String color){
		this.color=color;
	}
	public void bite() {};
	public void feeded() {};
	public void bark() {};
}

class Viggle extends Dog{
	Viggle(String color){
		super(color);
	}
	
}

class GoldenRetriver extends Dog{
	GoldenRetriver(String color){
		super(color);
	}
	public void swim() {};
}