package co.com.walberto.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import co.com.walberto.hook.Abrir;
import co.com.walberto.tasks.Ingresar;
import co.com.walberto.questions.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class LoginStepDefinitions {


    @Given("que el usuario abre la aplicación")
    public void queElUsuarioAbreLaAplicación() {
        OnStage.theActorCalled("Mazzili").attemptsTo(
                Abrir.elNavegador()
        );

    }

    @When("inicia sesión con el usuario {string} y contraseña {string}")
    public void iniciaSesiónConElUsuarioYContraseña(String usuario, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ingresar.misCredenciales(usuario,password)
        );
    }

    @Then("debería ver la página de productos")
    public void deberíaVerLaPáginaDeProductos() {
        OnStage.theActorInTheSpotlight().should(seeThat(
                TituloDeProducto.esVisible()
        ));
    }

    @Then("debería ver el mensaje de error {string}")
    public void deberíaVerElMensajeDeError(String msj) {
        OnStage.theActorInTheSpotlight().should(seeThat(
                Credenciales.noSonCorrectas(msj)
        ));
    }

}
