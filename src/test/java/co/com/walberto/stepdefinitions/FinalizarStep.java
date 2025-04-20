package co.com.walberto.stepdefinitions;

import co.com.walberto.tasks.VistaOverview;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import co.com.walberto.questions.VistaFinalizarFlujo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FinalizarStep {



    @When("el cliente se debe encontrar en la vista overview y presionar clic en el btn finish")
    public void elClienteSeDebeEncontrarEnLaVistaOverviewYPresionarClicEnElBtnFinish() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VistaOverview.clicEnBtnFinalizar()
        );
    }
    @Then("debería ver el mensaje de finalizacion {string}")
    public void deberíaVerElMensajeDeFinalizacion(String msj) {
        OnStage.theActorInTheSpotlight().should(seeThat(
                VistaFinalizarFlujo.msjDespedida(msj)
        ));
    }
}
