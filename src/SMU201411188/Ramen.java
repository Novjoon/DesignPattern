package SMU201411188;

public class Ramen {
	public static enum CookingMode {
		GENERAL, WITHOUT_BROTH, WITH_CHEESE, WITH_VINEGAR, WITH_MILK
	}

	private CookingMode mode;

	Ramen() {
		mode = CookingMode.GENERAL;
	}

	public void setCookMode(CookingMode mode) {
		this.mode = mode;
	}
	
	public void cook() {
		switch (mode) {
		case GENERAL:
			cookwithGeneralRecipe();
			break;
		case WITHOUT_BROTH:
			cookwithoutBroth();
			break;
		case WITH_CHEESE:
			cookwithCheese();
			break;
		default:
			break;
		}
	}
	
	private void cookwithGeneralRecipe() {
		System.out.println("일반조리");
	}

	private void cookwithoutBroth() {
		System.out.println("볶음라면");
	}
	
	private void cookwithCheese() {
		System.out.println("치즈라면");
	}
	
}