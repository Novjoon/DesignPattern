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
		description = " ����������";
	}

	public double cost() {
		return 1.0;
	}
}

class HouseBlend extends Beverage {
	public HouseBlend() {
		description = " �Ͽ콺����";
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
		return beverage.getDescription() + " ��ī";
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

//�߰�
class Choco extends CondimentDecorator {
	Beverage beverage;

	public Choco(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " ����";
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