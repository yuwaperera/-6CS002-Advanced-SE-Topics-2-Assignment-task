
/**
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */

public class MultiLingualStringTable {
    private enum LanguageSetting {English, Klingon}
    private LanguageSetting currentLanguage = LanguageSetting.English;

    public void setLanguage(LanguageSetting language) {
        this.currentLanguage = language;
    }
   
    private String[] englishMessages = {"Enter your name:", "Welcome", "Have a good time playing Abominodo"};
    private String[] klingonMessages = {"'el lIj pong:", "nuqneH", "QaQ poH Abominodo"};

    public static String getMessage(int index){
        if(cl == LanguageSetting.English ){
            return em[index];
        } else {
            return km[index];
        }
    }
}
