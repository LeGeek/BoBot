package IUT.BoBot.SmartCells;

import java.util.ArrayList;
import java.util.Arrays;

import IUT.BoBot.SmartCell;

/**
 * Reply to Bonjour.
 *
 */
public class BonjourCell implements SmartCell {
	
	public static final ArrayList<String> greetings = new ArrayList<String>(Arrays.asList("Bonjour", "Yo", "Salut"));
	
	public String ask(String question) {
		for(final String greeting: greetings) {
			if(question.startsWith(greeting)) return "Bonjour!";
		}
		return null;
	}

}
