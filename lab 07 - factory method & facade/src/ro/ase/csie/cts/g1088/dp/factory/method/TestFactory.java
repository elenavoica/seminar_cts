package ro.ase.csie.cts.g1088.dp.factory.method;

public class TestFactory {

	public static void main(String[] args) {
		boolean isKidsGameMode = true;
		
		if(isKidsGameMode) {
			//only 4Kids
		} else {
			//only normal
		}
		
		FactoryAbstractCharacter factoryCharacter = null;
		factoryCharacter = (isKidsGameMode) ? new FactoryMode4Kids() : new FactoryClassic();
		
		//game development
		GameCharacter superman =  factoryCharacter.getCharacter(CharacterType.MARVEL, "Superman");
	}

}
