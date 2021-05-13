package ro.ase.csie.cts.g1088.dp.testtest;

public class PizzaFactory {
	private static PizzaFactory pizza;
	
	private PizzaFactory() {}
	
	public static PizzaFactory getPizza() {
		if(pizza == null) {
			pizza = new PizzaFactory();
		}
		return pizza;
	}
	
	public static Pizza makePizza(String pizzaType) {
		switch (pizzaType) {
			case "Ham": return new Type1();
			case "Cheese": return new Type2();
		}
		throw new UnsupportedOperationException();
	}
	
	public static void main (String[] args) {
		
		PizzaFactory pizzaFactory = PizzaFactory.getPizza();
		pizzaFactory.makePizza("Ham");
		pizzaFactory.makePizza("Cheese");
		//pizzaFactory.makePizza("h");
	}
}

