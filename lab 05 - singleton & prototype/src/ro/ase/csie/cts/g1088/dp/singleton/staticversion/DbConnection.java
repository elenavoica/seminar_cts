package ro.ase.csie.cts.g1088.dp.singleton.staticversion;

public class DbConnection {
	String ip;
	String name;
	
	public static final DbConnection connection;
	
	static {
		//connection data from other sources
		String ip = "127.0.0.1";
		String name = "dbtest";
		connection = new DbConnection(ip, name); 
	}

	private DbConnection(String ip, String name) {
		this.ip = ip;
		this.name = name;
	}
		
}
