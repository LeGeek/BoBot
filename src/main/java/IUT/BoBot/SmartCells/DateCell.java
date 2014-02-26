package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by legeek on 26/02/14.
 */
public class DateCell implements SmartCell{

    @Override
    public String ask(String question) {
        if(question.contains("Quel date")){
            return generateDate("EEEE dd MMMMM yyyy");
        } else {
            return null;
        }
    }

    private String generateDate(String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(new Date());
    }
}
