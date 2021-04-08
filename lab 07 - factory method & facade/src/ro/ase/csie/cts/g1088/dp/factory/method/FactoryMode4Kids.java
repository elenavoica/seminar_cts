package ro.ase.csie.cts.g1088.dp.factory.method;

public class FactoryMode4Kids extends FactoryAbstractCharacter {

	@Override
	public GameCharacter getCharacter(CharacterType type, String name) {
		GameCharacter character = null;
		switch(type) {
		case DISNEY:
			character = new DisneyCharacter4Kids();
			break;
		case MARVEL:
			character = new MarvelCharacter4Kids();
			break;
		case DC: 
			character = new DcComicsCharacter4Kids();
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return character;		
	}
}
