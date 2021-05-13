package ro.ase.csie.cts.g1088.dp.testtest1;

public class Main {

	public static void main(String[] args) {
		
		Product p1 = new Product(100);
		Product p2 = new Product(150);
		Product p3 = new Product(500);
		Product p4 = new Product(800);
		
		Box bigBox = new Box();		
		Box box1 = new Box();
		Box box2 = new Box();
		
		box1.addNode(p1);
		box1.addNode(p2);
		box2.addNode(p3);
		bigBox.addNode(box1);
		bigBox.addNode(box2);
		bigBox.addNode(p4);
		
		System.out.println(bigBox.getPrice());
		
	}

}
