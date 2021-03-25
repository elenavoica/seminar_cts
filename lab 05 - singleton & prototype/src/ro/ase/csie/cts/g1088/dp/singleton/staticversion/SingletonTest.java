package ro.ase.csie.cts.g1088.dp.singleton.staticversion;

public class SingletonTest {

	public static void main(String[] args) {
		DbConnection connection1 = DbConnection.connection;
		DbConnection connection2 = DbConnection.connection;
		
		if(connection1 == connection2) {
			System.out.println("same");
		}
	}

}
