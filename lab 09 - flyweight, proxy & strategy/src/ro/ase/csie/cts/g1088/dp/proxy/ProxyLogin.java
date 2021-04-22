package ro.ase.csie.cts.g1088.dp.proxy;

public class ProxyLogin implements LoginInterface {
	LoginInterface officialModule; 

	@Override
	public boolean login(String user, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyServerStatus() {
		// TODO Auto-generated method stub
		return false;
	}

}
