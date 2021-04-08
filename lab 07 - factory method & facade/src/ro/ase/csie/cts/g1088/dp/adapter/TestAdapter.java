package ro.ase.csie.cts.g1088.dp.adapter;

import java.util.ArrayList;

import ro.ase.csie.cts.g1088.dp.factory.method.DisneyCharacter;
import ro.ase.csie.cts.g1088.dp.factory.method.GameCharacter;

public class TestAdapter {

	public static void main(String[] args) {
		//character collection
		
		ArrayList<GameCharacter> characters = new ArrayList<>();
		characters.add(new DisneyCharacter("Donald"));
		
		//ea collection 
		ArrayList<CharacterInterfaceEA> EACharacters = new ArrayList<>();
		EACharacters.add(new GenericEACharacter());
		
		//using an adapter
		CharacterInterfaceEA EACharacter = new GenericEACharacter();
		EaAdapter2GameCharacter adapt = new EaAdapter2GameCharacter(EACharacter);
		characters.add(adapt);
	}

}
