package ro.ase.csie.cts.g1088.dp.facade;

public class FacadeAPIGame {
	//interface for player profile
	
	public static String getProfile(String username, String password) {
		//create connection
				GameConnection connection = new GameConnection();
				connection.connection();
				
				//2. login player
				Player player = new Player();
				player.login(connection);
				
				//get profile
				PlayerProfile profile = player.getProfile();
				
				//get data
				String profileData = profile.getProfile();
				return profileData;
				
	}
}
