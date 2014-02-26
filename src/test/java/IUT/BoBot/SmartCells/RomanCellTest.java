package IUT.BoBot.SmartCells;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanCellTest {
	
	RomanCell cell = new RomanCell();

	@Test
	public void testSingleNumbers() {
		for(final Character numeral: RomanCell.numerals.keySet()) {
			assertEquals(Integer.toString(RomanCell.numerals.get(numeral)), cell.ask(numeral + " en nombres arabes"));
		}
	}

}
