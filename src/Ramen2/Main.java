package Ramen2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ramen ramencook = new GeneralRamen();
		ramencook.cook();
		ramencook = new RamenwithoutBroth();
		ramencook.cook();
	}

}
