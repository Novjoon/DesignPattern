package Ramen3;

public class Ramen {
	Recipe recipe = new GeneralRamenRecipe();

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public void cook() {
		recipe.cook();
	}
}

class GeneralRamenRecipe implements Recipe {
	public void cook() {
		System.out.println("��");
	}
}

class BrothRecipe implements Recipe {
	public void cook() {
		System.out.println("����");
	}
}

class CheeseRamenRecipe implements Recipe {
	public void cook() {
		System.out.println("ġ��");
	}
}