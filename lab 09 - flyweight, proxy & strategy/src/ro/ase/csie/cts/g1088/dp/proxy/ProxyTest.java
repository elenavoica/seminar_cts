package ro.ase.csie.cts.g1088.dp.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		
		LoginInterface login = new LoginModule("10.0.0.1");
		if(login.login("admin", "workpls"))
			System.out.println("hello amin");
		
		//add proxy
		login = new ProxyLogin(login);
		
		String[] passwords = new String[] {"1234" , "workpls", "will", "i", "finish", "college", "idk"};
		for(String password : passwords) {
			if(login.login("admin", password))
				System.out.println("found the password: " + password);
		}
		
		System.out.println("Game over");
	}

}
