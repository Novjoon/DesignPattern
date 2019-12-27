package DecoratePattern;

public class Starbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b = new Espresso();
		
		System.out.println("주문은" + b.getDescription() + " 가격은  $" + b.cost());
		
		b = new Mocha(b);
		
		System.out.println("주문은" + b.getDescription() + " 가격은  $" + b.cost());
		
		b = new Choco(b);
		System.out.println("주문은" + b.getDescription() + " 가격은  $" + b.cost());
		
		b.setSize("B");
		System.out.println("주문은" + b.getDescription() + " 가격은  $" + b.cost());
		
		b = new Choco(b);
		System.out.println("주문은" + b.getDescription() + " 가격은  $" + b.cost());
	}

}
