package ro.ase.csie.cts.g1088.dp.facade;

public class TestFacade {

	public static void main(String[] args) {
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
		//return profileData;
		
		//facade
		
		String profileData2 = FacadeAPIGame.getProfile("player1", "1234");
	}

}
