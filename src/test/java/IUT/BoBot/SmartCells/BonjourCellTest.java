package IUT.BoBot.SmartCells;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BonjourCellTest {
	
	BonjourCell cell = new BonjourCell();;

	@Test
	public void testGreetings() {
		for(final String greeting: BonjourCell.greetings) {
			assertEquals("Bonjour!", cell.ask(greeting));
		}
	}
	
	@Test
	public void testNotBonjour() {
		assertEquals(null, cell.ask("au revoir"));
	}

}
