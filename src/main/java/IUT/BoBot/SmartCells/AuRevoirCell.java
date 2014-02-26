package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

/**
 * Created by legeek on 26/02/14.
 */
public class AuRevoirCell implements SmartCell{

    @Override
    public String ask(String question) {
        if(question.equals("au revoir")){
            return "au revoir";
        } else {
            return null;
        }
    }
}
