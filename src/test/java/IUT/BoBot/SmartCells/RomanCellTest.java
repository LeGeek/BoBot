package IUT.BoBot.SmartCells;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanCellTest {
	
	RomanCell cell = new RomanCell();

	@Test
	public void testSingleRomanNumbers() {
		for(final Character numeral: RomanCell.numerals.keySet()) {
			assertEquals(Integer.toString(RomanCell.numerals.get(numeral)), cell.ask(numeral + " en nombres arabes"));
		}
	}
	
	@Test
	public void testMMXIV() {
		assertEquals(Integer.toString(2014), cell.ask("MMXIV en nombres arabes"));
	}
	
	@Test
	public void testMIM() {
		assertEquals(Integer.toString(2001), cell.ask("MIM en nombres arabes"));
	}
	
	@Test
	public void testVX() {
		assertEquals(Integer.toString(15), cell.ask("VX en nombres arabes"));
	}

}
