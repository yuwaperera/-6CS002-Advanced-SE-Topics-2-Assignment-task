import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import org.junit.Test;

public class Q_ClassTesting {

    @Test
    public void testSwitchCase5() {
        // Act
        String result = performSwitchCase5();

        // Assert
        assertEquals("The result should start with a name and end with a quote text",
                " said \"", result.substring(0, 7));
        assertTrue("The result should have a non-empty quote text",
                result.substring(7, result.length() - 1).trim().length() > 0);
        assertEquals("The result should end with a closing quote and two newline characters",
                "\"\n\n", result.substring(result.length() - 3));
    }

    private String performSwitchCase5() {
        // Arrange - No need to instantiate _Q, as the quotes list is static
        int _$_ = 5;

        // Act
        switch (_$_) {
            case 5:
            	 List<_Q> quotes = _Q.getQuotes();
                 int index = (int) (Math.random() * (quotes.size()));
                 
                 _Q randomQuote = quotes.get(index);

                 String who = randomQuote.getAuthor();
                 String what = randomQuote.getQuoteText();
                return who + " said \"" + what + "\"\n\n";
            // Add other cases if needed
            default:
                return ""; // Return an empty string for other cases
        }
    }
}
