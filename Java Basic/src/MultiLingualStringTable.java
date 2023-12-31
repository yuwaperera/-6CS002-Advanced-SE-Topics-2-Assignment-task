import java.util.HashMap;
import java.util.Map;

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

    private Map<LanguageSetting, String[]> messageMap = new HashMap<>();
    
    public MultiLingualStringTable() {
        messageMap.put(LanguageSetting.English, new String[]{"Enter your name:", "Welcome", "Have a good time playing Abominodo"});
        messageMap.put(LanguageSetting.Klingon, new String[]{"'el lIj pong:", "nuqneH", "QaQ poH Abominodo"});
    }

    public String getMessage(int index) {
        return messageMap.get(currentLanguage)[index];
    }
}
