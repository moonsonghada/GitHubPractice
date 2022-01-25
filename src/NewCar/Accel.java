package NewCar;

class Accel {
	
	String name;
	
	Accel(String carName){
		this.name=carName;
	}
	
	void push() {
		System.out.println(String.format("%s가 직진 중", name));
	}
}