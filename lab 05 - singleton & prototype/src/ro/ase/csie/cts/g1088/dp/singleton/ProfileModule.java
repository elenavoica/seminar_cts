package ro.ase.csie.cts.g1088.dp.singleton;

public class ProfileModule {
	public ProfileModule() {
		DbConnection connection =  DbConnection.getConnection();
	}
}
