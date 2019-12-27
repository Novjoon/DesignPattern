package SMU201411188;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ramen cook = new Ramen();
		cook.cook();
		
		cook.setCookMode(Ramen.CookingMode.WITH_CHEESE);
		cook.cook();
	}

}
