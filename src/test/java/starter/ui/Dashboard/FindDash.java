package starter.ui.Dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class FindDash implements Question<String> {

    public static Question<String> value() {
        return new FindDash();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(LatestNews.News).getText();
    }
}
