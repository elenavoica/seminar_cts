package ro.ase.csie.cts.g1088.dp.proxy;
import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements LoginInterface {
	LoginInterface officialModule; 
	public static int MAXIMUM_TRIES = 3;
	Map<String, Integer> users = new HashMap<>();
	

	public ProxyLogin(LoginInterface officialModule) {
		super();
		this.officialModule = officialModule;
	}

	@Override
	public boolean login(String user, String password) {
		Integer tries = users.get(user);
		if(tries == null) {
			users.put(password, 0);
			tries = 0;
		} 
		
		if(tries >= MAXIMUM_TRIES) {
			return false;
		}
		
		if(officialModule.login(user, password)) {
			users.put(password, 0);
			return true;
		} else {
			tries += 1;
			users.put(password, tries);
			if(tries == MAXIMUM_TRIES) {
				System.out.println("Account suspended");
			}
			return false;
		}
	}

	@Override
	public boolean verifyServerStatus() {
		return officialModule.verifyServerStatus();
	}

}
