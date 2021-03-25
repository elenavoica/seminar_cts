package ro.ase.csie.cts.g1088.dp.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		DbConnection connection1 = DbConnection.getConnection();
		DbConnection connection2 = DbConnection.getConnection();
		
		if(connection1 == connection2) {
			System.out.println("Same references");
		} else {
			System.out.println("Different references");
		}
		
		UIModule uiModule = new UIModule();
		ProfileModule profileModule = new ProfileModule();
	}
}
