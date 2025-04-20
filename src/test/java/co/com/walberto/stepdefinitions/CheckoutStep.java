package co.com.walberto.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import co.com.walberto.tasks.VistaCheckout;

import java.util.List;
import java.util.Map;

public class CheckoutStep {

    @When("completa el formulario con nombre {string}, apellido {string} y código postal {int} y continuamos a la siguiente vista")
    public void completaElFormularioConNombreApellidoYCodigoPostal(String nombre, String apellido, int codigoPostal) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VistaCheckout.llenarFomulario(nombre,apellido,codigoPostal)
        );
    }

    @When("completo el formulario con los siguientes datos:")
    public void completoElFormularioConLosSiguientesDatos(List<Map<String,String>> datosCheckOut) {

    }
    @Then("debería ver el mensaje {string}")
    public void deberíaVerElMensaje(String string) {

    }

}
