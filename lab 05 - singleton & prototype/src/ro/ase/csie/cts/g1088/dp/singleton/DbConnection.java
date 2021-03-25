package ro.ase.csie.cts.g1088.dp.singleton;

public class DbConnection {
	String ip;
	String name;
	
	//eager version
	private static DbConnection connection = null;
	
	private DbConnection() {	
	}

	private DbConnection(String ip, String name) {
		super();
		System.out.println("constructor");
		this.ip = ip;
		this.name = name;
	}
	
	//lazy version
	//synchronized is used for multi-threading
	public static synchronized DbConnection getConnection() {
		if(connection == null) {
			//data form files
			connection = new DbConnection("10.0.0.1", "cts");
		}
		return connection;
	}
	
}
