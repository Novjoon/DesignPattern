package DecoratePattern;

public abstract class Beverage {
	String description = "";
	String size = "normal";
	
	public String getDescription() {
		return description;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size= size;
	}

	public abstract double cost();
}



class Espresso extends Beverage {
	public Espresso() {
		description = " 에스프레소";
	}

	public double cost() {
		return 1.0;
	}
}

class HouseBlend extends Beverage {
	public HouseBlend() {
		description = " 하우스블렌드";
	}

	public double cost() {
		return 0.5;
	}
}

class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " 모카";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = beverage.cost();
		if (getSize().equals("B")) {
			return cost * 2;
		} else if (getSize().equals("S")) {
			return cost / 2;
		}
		return beverage.cost() + 1.0;
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return beverage.size;
	}

}

//추가
class Choco extends CondimentDecorator {
	Beverage beverage;

	public Choco(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " 초코";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = beverage.cost();
		if (getSize().equals("B")) {
			return cost * 2;
		} else if (getSize().equals("S")) {
			return cost / 2;
		}
		return beverage.cost() + 1.50;
	}


	public void setSize(String size) {
		this.size= size;
	}
	
	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return beverage.size;
	}

}