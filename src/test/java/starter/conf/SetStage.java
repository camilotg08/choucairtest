package starter.conf;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SetStage {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
