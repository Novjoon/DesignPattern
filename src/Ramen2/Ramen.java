package Ramen2;

abstract class Ramen {
	public abstract void cook();
}

class GeneralRamen extends Ramen{
	public void cook() {
		System.out.println("그냥");
	}
}

class RamenwithoutBroth extends Ramen{
	public void cook() {
		System.out.println("볶기");
	}
}

class RamenwithCheese extends Ramen{
	public void cook() {
		System.out.println("치즈라면");
	}
}


