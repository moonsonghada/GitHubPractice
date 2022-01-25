package EnumAndSingleton;

//Enum
//: �ǹ��ִ� ����� �����ϰ� ���α׷��� �������� ���� ���Ǵ� "singleton�� ����"


public class Main{
	/* ex. ���信�� ���ϴ� ������ �����ϴ� ���α׷�
	 *  ���� ���� �ڵ带 �ο��ϰ�
	 *  �ش� �ڵ带 ���� �� ������ ��������
	 */
	public static void main(String[] args) {
		
		// enum Ÿ���� argument�� ���� �� �ִ�
		Person p1 = new Person();
		p1.chocie(FoodCategory.NOODLE);
		
		// enum ���� method
		// 1. name() : ���ǵ� �̸��� return
		System.out.println(FoodCategory.CHICKEN.name()); // String Ÿ��
		System.out.println(FoodCategory.CHICKEN); // FoodCategory Ÿ��
		// 2. ordinal() : �ۼ��� ������ return
		System.out.println(FoodCategory.CHICKEN.ordinal());
		
		
		// enum upgrade�غ���
		System.out.println(EnumUpgrade.NOODLE);
		System.out.println(EnumUpgrade.NOODLE.name());
		System.out.println(EnumUpgrade.NOODLE.price);
		
		
		
		// enum�� ������: private
		// ��� singleton�̱� ������ �翬�ϴ�!
		
	}
}


