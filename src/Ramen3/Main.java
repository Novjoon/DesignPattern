package Ramen3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ramen Rcook = new Ramen();
		Rcook.cook();
		
		Rcook.setRecipe(new BrothRecipe());
		Rcook.cook();
	}

}
