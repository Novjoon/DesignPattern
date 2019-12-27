package FactoryPattern;

public abstract class PizzaStore {
	void prepareToBoxing(Pizza pizza) {
//		pizza.prepare();
//		pizza.bake();
//		pizza.cut();
//		pizza.box();
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		prepareToBoxing(pizza);
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
}
