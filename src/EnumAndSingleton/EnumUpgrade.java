package EnumAndSingleton;

public enum EnumUpgrade {
	NOODLE(7000), FIREDRICE(6000);
	
	int price;
	EnumUpgrade(int price){
		this.price=price;
	}
}
