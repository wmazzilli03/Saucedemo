package co.com.walberto.stepdefinitions;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.Before;

public class Hook {

    @Before
    public void prepararActor(){
        OnStage.setTheStage(new OnlineCast());
    }

}
