package ro.ase.csie.cts.g1088.dp.singleton.register;

public class SingletonTest {

	public static void main(String[] args) {
		DbConnection connection1 = DbConnection.getConnection("10.0.0.1", "cts");
		DbConnection connection2 = DbConnection.getConnection("10.0.0.1", "cts");
		DbConnection connection3 = DbConnection.getConnection("127.0.0.1", "cts");
		
		if(connection1 == connection2) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		if(connection1 == connection3) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
	}

}
