package ro.ase.csie.cts.g1088.dp.testtest.A8;

public class Main {
	public static void main(String[] args) {
		Sectie s1 = new Sectie("sectie 1");
		Sectie s2 = new Sectie("sectie 2");
		Sectie s3 = new Sectie("sectie 3");
		Sectie s4 = new Sectie("sectie 4");
		
		Departament d1 = new Departament();
		Departament d2 = new Departament();
		Departament d3 = new Departament();
		
		d1.addNode(s1);
		d1.addNode(s2);
		d2.addNode(s3);
		d3.addNode(s4);
		
		System.out.println(d1.getName());
	}
}
