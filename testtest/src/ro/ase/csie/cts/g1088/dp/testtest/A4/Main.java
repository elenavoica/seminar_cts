package ro.ase.csie.cts.g1088.dp.testtest.A4;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Reteta reteta1 = new Reteta("paracetamol", 10);
		Reteta reteta2 = new Reteta("algocalmin", 50);
		
		Reteta reteta3 = (Reteta) reteta1.clone();
		Reteta reteta4 =(Reteta) reteta2.clone();
		
		System.out.println(reteta1);
		System.out.println(reteta2);
		System.out.println(reteta3);
		System.out.println(reteta4);
	}

}
