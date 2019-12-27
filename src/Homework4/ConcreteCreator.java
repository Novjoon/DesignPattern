package Homework4;

public class ConcreteCreator extends Creator {
//	Product product;

	//private ConcreteCreator() {
	//}
	
	private volatile static ConcreteCreator inst;
	
	private ConcreteCreator() {
		// TODO Auto-generated constructor stub
	}
	
	public static ConcreteCreator getInstance() {
		if(inst==null) {
			synchronized (ConcreteCreator.class) {
				if(inst==null) {
					inst = new ConcreteCreator();
				}
			}
		}
		return inst;
	}

	@Override
	public Product factoryMethod(String type, String title, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		if (type.equals("text")) {
			return new TextFieldWindow(title, x, y, width, height);
		} else if (type.equals("label")) {
			return new LabelWindow(title, x, y, width, height);
		} else
			return null;
	}

}
