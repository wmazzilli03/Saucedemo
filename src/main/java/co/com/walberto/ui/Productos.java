package co.com.walberto.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Productos extends PageObject {


    public static Target botonAgregarProducto(String nombreProducto) {
        return Target.the("Botón para agregar el producto " + nombreProducto)
                .located(By.xpath("//div[text()='" + nombreProducto + "']"));
    }

    public static Target botonAgregarProductoAlAzar(String nombreProducto) {
        return Target.the("Botón para agregar el producto " + nombreProducto)
                //div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item']//button
                .located(By.xpath("//div[text()='" + nombreProducto + "']/ancestor::div[@class='inventory_item']//button"));
        //.located(By.xpath("//div[text()='" + nombreProducto + "']"));
    }

    public static final Target TITLE_PRODUCTS = Target.the("Titulo de la pagina principal de productos").
            located(By.xpath("//div[text()='Swag Labs']"));

    public static final Target BTN_ADD_CART = Target.the("Btn que nos ayuda a enviar los productos al carrito de compra").
            located(By.id("add-to-cart"));

    public static final  Target ICONO_CARRITO_COMPRA = Target.the("Icono del carrito de compra, clic para ingresar").
            located(By.cssSelector(".shopping_cart_badge"));

    public static final Target TITULO_DESCRIPCION = Target.the("Titulo que se debe visualizar cuando este en la descripcion del producto.").
            located(By.xpath("//div[text()='Swag Labs']"));






}
