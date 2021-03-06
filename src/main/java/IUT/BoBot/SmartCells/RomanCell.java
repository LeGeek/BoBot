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
		String number = question.substring(0, question.indexOf(" "));
		if(question.contains("en nombres arabes"))
			return Integer.toString(toArab(number));
		
		return null;
	}
	
	private int toArab(String roman) {
		roman = roman.toUpperCase();
		int arab = 0;
		
		for(int c = 0; c < roman.length(); ++c) {	
			if(c < roman.length() - 1 && directlyAbove(roman.charAt(c), roman.charAt(c+1))) {
				arab += numerals.get(roman.charAt(c+1));
				arab -= numerals.get(roman.charAt(c));
				
				++c;
			} else {
				arab += numerals.get(roman.charAt(c));
			}
		}
		
		return arab;
	}

	private boolean directlyAbove(char c1, char c2) {
		return (numerals.get(c2)/numerals.get(c1) == 5) || (numerals.get(c2)/numerals.get(c1) == 10);
	}

}
