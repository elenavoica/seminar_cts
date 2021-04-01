package ro.ase.csie.cts.g1088.dp.builder;

public class BuilderTest {

	public static void main(String[] args) {
		
		Superhero superman = new Superhero.SuperheroBuilder("Superman", 100).build();
		Superhero joker = new Superhero .SuperheroBuilder("joker", 200).isEnemy().isInjured().
				setRighttWeapon(new Weapon()).build();
	}

}
