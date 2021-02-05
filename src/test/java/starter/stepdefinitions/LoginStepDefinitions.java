package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.ui.Dashboard.ResultNews;
import starter.ui.Login.Login;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinitions {

    String name;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) has an active account")
    public void tomas_has_an_active_account(String name) {
        this.name = name;
    }

    @When("he make login with email and password")
    public void he_make_login_with_email_and_password() {
        theActorCalled(name).attemptsTo (
                NavigateTo.HomePage(),
                Login.withCredentials("admin@phptravels.com", "demoadmin")
        );
    }

    @Then("the login is successful")
    public void the_login_is_successful() {
        theActorInTheSpotlight().should(
                seeThat("Dashboard", ResultNews.LatestNews(), equalTo("DASHBOARD"))
        );
    }
}
