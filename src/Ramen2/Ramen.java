package Ramen2;

abstract class Ramen {
	public abstract void cook();
}

class GeneralRamen extends Ramen{
	public void cook() {
		System.out.println("�׳�");
	}
}

class RamenwithoutBroth extends Ramen{
	public void cook() {
		System.out.println("����");
	}
}

class RamenwithCheese extends Ramen{
	public void cook() {
		System.out.println("ġ����");
	}
}


