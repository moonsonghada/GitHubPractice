package NewCar;

public class MyCar {

	String name;
	Accel accel;
	Engine engine;
	Handle handle;
	Wheel wheel;
		
	public MyCar(String name){
		this.name=name;
		this.accel = new Accel(name);
		this.engine = new Engine(name);
		this.handle = new Handle();
		this.wheel = new Wheel("금호타이어");
		
	}
	
	public void run() {
		if(engine.isStarted==true) {
			accel.push();
			wheel.roll();
		}
	}
	
	public void stop() {
		if(engine.isStarted==true)
				engine.onOff();
		
	}
	
	public void ready() {
		if(engine.isStarted==false)
			engine.onOff();
	}
	
	public void turnLeft() {
		handle.turnLeft();
	}
	public void turnRight() {
		handle.turnRight();
	}
	
	
	
}