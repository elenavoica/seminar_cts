package ro.ase.csie.cts.g1088.dp.proxy;

public class LoginModule implements LoginInterface {
	String serverIp;
	
	

	public LoginModule(String serverIp) {
		super();
		this.serverIp = serverIp;
	}

	@Override
	public boolean login(String user, String password) {
		if(user.equals("admin") && password.equals("workpls"))
		return true;
	else 
		return false;
	}

	@Override
	public boolean verifyServerStatus() {
		return false;
	}

}
