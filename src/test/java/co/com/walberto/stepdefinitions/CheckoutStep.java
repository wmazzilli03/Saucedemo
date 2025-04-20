package co.com.walberto.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import co.com.walberto.tasks.VistaCheckout;
import co.com.walberto.questions.Overview;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CheckoutStep {

    @When("completo el formulario con los siguientes datos:{string},{string},{string}")
    public void completoFormularioConDatos(String nombre, String apellido, String codigoPostal) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VistaCheckout.llenarFomulario(nombre,apellido,codigoPostal)
        );
    }

    @When("completo el formulario con los siguientes datos:")
    public void completoElFormularioConLosSiguientesDatos(List<Map<String,String>> datosCheckOut) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VistaCheckout.llenarFomularioPorUnMap(datosCheckOut)
        );
    }

    @Then("debería ver el mensaje {string}")
    public void deberíaVerElMensaje(String nombreVista) {
        OnStage.theActorInTheSpotlight().should(seeThat(
            Overview.isVisible(nombreVista)
        ));

    }


}
