package NewCar;

public class Engine {
	
	String name;
	boolean isStarted = false;
	
	Engine(String carName){
		this.name=carName;
	}
	
	void onOff() {
		if(isStarted==false) {isStarted=true;}
		else {isStarted=false;}
	}
	
}