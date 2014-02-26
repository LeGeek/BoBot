package IUT.BoBot;

import static org.junit.Assert.*;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Integration tests checking the Bot
 * behavior. We just test some cases to make sure that the
 * Bot is using SmartCells properly.
 */
public class BotTest {
    Bot bot = new Bot();

    @Test
    public void testBonjour() {
        assertEquals("Bonjour!", bot.ask("Bonjour"));
    }

    @Test
    public void testJeMAppelle() {
        assertEquals("Bonjour Seb!", bot.ask("Je m'appelle Seb"));
    }

    @Test
    public void testNull() {
        assertEquals(null, bot.ask("This is not a question."));
    }

    @Test
    public void testAuRevoir(){
        assertEquals("au revoir", bot.ask("au revoir"));
    }

    @Test
    public void testDate(){
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE dd MMMMM yyyy");

        assertEquals(simpleDateFormat.format(today), bot.ask("Quel date sommes-nous ?"));
    }
}
