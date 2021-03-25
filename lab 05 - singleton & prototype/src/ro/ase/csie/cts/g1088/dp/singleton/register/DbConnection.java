package ro.ase.csie.cts.g1088.dp.singleton.register;

import java.util.Hashtable;

public class DbConnection {
	String ip;
	String name;
	
	private static Hashtable<String, DbConnection> connections = new Hashtable<>();

	private DbConnection(String ip, String name) {
		super();
		this.ip = ip;
		this.name = name;
	}
	
	public static DbConnection  getConnection(String ip, String name) {
		DbConnection connection = connections.get(ip);
		if(connection == null) {
			connection = new DbConnection(ip, name);
			connections.put(ip, connection);
		}
		return connection;
	}	
}
