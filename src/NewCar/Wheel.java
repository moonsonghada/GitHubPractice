package NewCar;

public class Wheel {
	
	String tireName;
	boolean rolling;
	
	Wheel(String tireName){
		this.tireName=tireName;
		rolling = false;
	}
	
	void roll() {
		rolling=true;
		System.out.println("������ ������ ��");
	}
	
}
