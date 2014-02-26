package IUT.BoBot.SmartCells;


import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import static org.junit.Assert.*;

/**
 * Created by legeek on 26/02/14.
 */
public class DateCellTest {
    DateCell dateCell = new DateCell();

    @Test
    public void testDate(){
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE dd MMMMM yyyy");
        assertEquals(simpleDateFormat.format(today), dateCell.ask("Quel date sommes-nous ?"));
    }

    @Test
    public void testNull(){
        assertEquals(null, dateCell.ask(""));
    }
}

