package EnumAndSingleton;

//Enum
//: 의미있는 상수를 정의하고 프로그램의 안정성을 위해 사용되는 "singleton의 일종"


public class Main{
	/* ex. 뷔페에서 원하는 음식을 선택하는 프로그램
	 *  음식 별로 코드를 부여하고
	 *  해당 코드를 선택 시 음식을 가져다줌
	 */
	public static void main(String[] args) {
		
		// enum 타입을 argument로 넣을 수 있다
		Person p1 = new Person();
		p1.chocie(FoodCategory.NOODLE);
		
		// enum 관련 method
		// 1. name() : 정의된 이름을 return
		System.out.println(FoodCategory.CHICKEN.name()); // String 타입
		System.out.println(FoodCategory.CHICKEN); // FoodCategory 타입
		// 2. ordinal() : 작성된 순서를 return
		System.out.println(FoodCategory.CHICKEN.ordinal());
		
		
		// enum upgrade해보자
		System.out.println(EnumUpgrade.NOODLE);
		System.out.println(EnumUpgrade.NOODLE.name());
		System.out.println(EnumUpgrade.NOODLE.price);
		
		
		
		// enum의 생성자: private
		// 사실 singleton이기 때문에 당연하다!
		
	}
}


