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
		System.out.println("°Á");
	}
}

class BrothRecipe implements Recipe {
	public void cook() {
		System.out.println("ººÀ½");
	}
}

class CheeseRamenRecipe implements Recipe {
	public void cook() {
		System.out.println("Ä¡Áî");
	}
}