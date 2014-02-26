package IUT.BoBot.SmartCells;

import java.util.HashMap;
import java.util.Map;

import IUT.BoBot.SmartCell;

public class RomanCell implements SmartCell{

	public final static Map<Character, Integer> numerals = new HashMap<Character, Integer>() {{
		put('I', 1);
		put('V', 5);
		put('X', 10);
		put('L', 50);
		put('C', 100);
		put('D', 500);
		put('M', 1000);
	}};
	
	@Override
	public String ask(String question) {
		return null;
	}

}
