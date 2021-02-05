package starter.ui.Category;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.ui.Blog.BlogForm;

public class ResultCate {
    public static Question<String> BlogForm() {
        return actor -> TextContent.of(BlogForm.CATEG_SCREEN).viewedBy(actor).asString();
    }
}
