package starter.ui.Dashboard;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ResultNews {
    public static Question<String> LatestNews() {
        return actor -> TextContent.of(LatestNews.News).viewedBy(actor).asString();
    }
}
