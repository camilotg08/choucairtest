package starter.ui.Blog;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Blog implements Task{

    public static Performable select() {
        return instrumented(Blog.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BlogForm.BLOG_MODULE),
                Click.on(BlogForm.BLOG_CATEGORIES)
        );
    }
}
