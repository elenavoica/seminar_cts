package ro.ase.csie.cts.g1088.dp.facade;

public class Player {
	public void login(GameConnection connection) {
		System.out.println("login player");
	}
	
	public PlayerProfile getProfile() {
		return new PlayerProfile();
	}
}
