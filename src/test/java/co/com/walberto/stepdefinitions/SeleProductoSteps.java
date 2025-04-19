package co.com.walberto.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import co.com.walberto.tasks.*;

public class SeleProductoSteps {


    @When("el usuario agrega el producto {string} al carrito al azar")
    public void elUsuarioAgregaElProductoAlCarritoAlAzar(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarProducto.alCarritoCompra(producto)
        );
    }

    @And("el usuario agrega mas de un producto en el carrito de compra")
    public void elUsuarioAgregaMasDeUnProductoEnElCarritoDeCompra() {

    }


    @And("el usurious agrega el producto {string} al carrito al azar")
    public void elUsuriousAgregaElProductoAlCarritoAlAzar(String arg0) {
    }

    @Then("en el carrito de compra debería tener al menos 1 productos agregados")
    public void enElCarritoDeCompraDeberíaTenerAlMenosProductosAgregados() {

    }

}
