package EnumAndSingleton;

public class Person {
	public void chocie(FoodCategory food) {
		switch(food) {
		case NOODLE:
			System.out.println("국수");
			break;
		case CHICKEN:
			System.out.println("치킨");
			break;
		}
	}
}
