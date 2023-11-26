import java.util.ArrayList;
import java.util.List;

public class _Q {
    private String quoteText;
    private String author;

    public _Q(String quoteText, String author) {
        this.quoteText = quoteText;
        this.author = author;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public String getAuthor() {
        return author;
    }

    public static List<_Q> getQuotes() {
        List<_Q> quotes = new ArrayList<>();

        quotes.add(new _Q("Progress comes from the intelligent use of experience.", "Elbert Hubbard"));
        quotes.add(new _Q("No amount of experimentation can ever prove me right; a single experiment can prove me wrong.", "Albert Einstein"));
        quotes.add(new _Q("To be trusted is a greater complement than to be loved.", "George MacDonald"));
        quotes.add(new _Q("Everything has beauty, but not everyone sees it.", "Confucius"));
        quotes.add(new _Q("Pretty much all the honest truth-telling there is in the world is done by children.", "Oliver Wendell Holmes"));
        quotes.add(new _Q("A lie cannot live.\", \"Martin Luther King Jr.", ""));
        

        return quotes;
    }
}
