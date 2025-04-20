package co.com.walberto.stepdefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import co.com.walberto.tasks.VistaDescripcionProducto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import co.com.walberto.questions.VistaCheckOut;

public class DescripcionProductoStep {


    @Then("el producto debería estar visible en el carrito")
    public void elProductoDeberíaEstarVisibleEnElCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VistaDescripcionProducto.alPresionarClick()
        );
    }

    @Then("el botón Checkout debería estar habilitado")
    public void elBotónCheckoutDeberíaEstarHabilitado() {
         OnStage.theActorInTheSpotlight().should(seeThat(
                 VistaCheckOut.verSubtituloCheckout()
         ));
    }
}
