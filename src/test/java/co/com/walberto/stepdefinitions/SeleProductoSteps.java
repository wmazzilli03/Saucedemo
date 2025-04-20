package co.com.walberto.stepdefinitions;

import co.com.walberto.questions.Credenciales;
import co.com.walberto.utils.DatosProducto;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import co.com.walberto.tasks.*;
import  co.com.walberto.questions.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SeleProductoSteps {


    @When("el usuario agrega el producto {string} al carrito al azar")
    public void elUsuarioAgregaElProductoAlCarritoAlAzar(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarProducto.alCarritoCompra(producto)
        );
    }

    @And("el usuario agrega un producto al carrito al azar")
    public void elUsuarioAgregaUnProductoAlCarritoAlAzar() {
       String producto = DatosProducto.obtenerProductoAleatorio();
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarProducto.alAzarAlCarritoCompra(producto)
        );
    }

    @And("el usuario agrega mas de un producto en el carrito de compra")
    public void elUsuarioAgregaMasDeUnProductoEnElCarritoDeCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(
               // AgregarMasDeUnProducto.aleatoriamente()
                AgregarProducto.aleatoriamente()
        );
    }

    @Then("en el carrito de compra debería tener al menos 1 productos agregados")
    public void enElCarritoDeCompraDeberíaTenerAlMenosProductosAgregados() {
        OnStage.theActorInTheSpotlight().should(seeThat(
                Descripcion.delCarritoCompra()
        ));
    }



}
