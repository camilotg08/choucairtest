package starter.ui.Category;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateCat implements Task {

    private final String category;
    private final String name;

    public CreateCat(String category, String name) {
        this.category = category;
        this.name = name;
    }

    public static Performable withData(String category, String name) {
        return instrumented(CreateCat.class, category, name);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(category).into(CategoryForm.NAME_FIELD),
                Enter.theValue(name).into(CategoryForm.VIET_FIELD),
                Enter.theValue(name).into(CategoryForm.RUSS_FIELD),
                Enter.theValue(name).into(CategoryForm.ARAB_FIELD),
                Enter.theValue(name).into(CategoryForm.FARS_FIELD),
                Enter.theValue(name).into(CategoryForm.TURK_FIELD),
                Enter.theValue(name).into(CategoryForm.FREN_FIELD),
                Enter.theValue(name).into(CategoryForm.ESPN_FIELD),
                Enter.theValue(name).into(CategoryForm.GERM_FIELD),
                Click.on(CategoryForm.CRE_BTN)
        );
    }

}
