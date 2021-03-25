package ro.ase.csie.cts.g1088.dp.singleton;

public class UIModule {
	public UIModule() {
		DbConnection connection = DbConnection.getConnection();
	}
}
