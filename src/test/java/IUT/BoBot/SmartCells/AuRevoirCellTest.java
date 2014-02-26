package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by legeek on 26/02/14.
 */
public class AuRevoirCellTest {
    AuRevoirCell auRevoirCell = new AuRevoirCell();

    @Test
    public void testAuRevoir(){
        assertEquals("au revoir", auRevoirCell.ask("au revoir"));
    }

    @Test
    public void testNull(){
        assertEquals(null, auRevoirCell.ask(""));
    }
}
