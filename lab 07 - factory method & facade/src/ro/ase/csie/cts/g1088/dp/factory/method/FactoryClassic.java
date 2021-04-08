package ro.ase.csie.cts.g1088.dp.factory.method;

public class FactoryClassic extends FactoryAbstractCharacter {

	@Override
	public GameCharacter getCharacter(CharacterType type, String name) {
		GameCharacter character = null;
		switch(type) {
		case DISNEY:
			character = new DisneyCharacter(name);
			break;
		case MARVEL:
			character = new MarvelCharacter(name, 300);
			break;
		case DC: 
			character = new DcComicsCharacter(name);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return character;
	}
}
