package DecoratePattern;

public class Starbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b = new Espresso();
		
		System.out.println("�ֹ���" + b.getDescription() + " ������  $" + b.cost());
		
		b = new Mocha(b);
		
		System.out.println("�ֹ���" + b.getDescription() + " ������  $" + b.cost());
		
		b = new Choco(b);
		System.out.println("�ֹ���" + b.getDescription() + " ������  $" + b.cost());
		
		b.setSize("B");
		System.out.println("�ֹ���" + b.getDescription() + " ������  $" + b.cost());
		
		b = new Choco(b);
		System.out.println("�ֹ���" + b.getDescription() + " ������  $" + b.cost());
	}

}
