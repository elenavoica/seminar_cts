package ro.ase.csie.cts.g1088.dp.testtest.A8;

public class Sectie implements Node {
	String name;
	
	public Sectie(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void print(String tabs) {
		System.out.println(tabs + name);
	}

}
