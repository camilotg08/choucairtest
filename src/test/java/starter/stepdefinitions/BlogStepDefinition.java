package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.ui.Blog.Blog;
import starter.ui.Category.CreateCat;
import starter.ui.Category.ResultCate;
import starter.ui.Login.Login;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class BlogStepDefinition {

    String name;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Tomas must be logged in and in the Blog module")
    public void tomas_must_be_logged_in_and_in_the_Blog_module() {
        theActorCalled(name).attemptsTo(
                NavigateTo.HomePage(),
                Login.withCredentials("admin@phptravels.com", "demoadmin"),
                Blog.select()
        );
    }

    @When("he create a new category")
    public void he_create_a_new_category() {
        theActorInTheSpotlight().attemptsTo(
                CreateCat.withData("Cas", "Casual")
        );
    }

    @Then("the category must be displayed")
    public void the_category_must_be_displayed() {
        theActorInTheSpotlight().should(
                seeThat("BLOG CATEGORIES", ResultCate.BlogForm(), equalTo("BLOG CATEGORIES"))
        );
    }

}
