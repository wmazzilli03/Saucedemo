package co.com.walberto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Descripcion extends Object{

    public static final Target BTN_CHECKOUT = Target.the("Btn para continuar el flujo en saucedemo").
            located(By.id("checkout"));

    public static final Target TXT_CHECKOUT = Target.the("Subtitlo para validar que estoy en el formulario de saucedemo").
            located(By.xpath("//span[text()='Checkout: Your Information']"));

    public static final Target TXT_CHECKOUT_OVERVIEW = Target.the("Vista overView ").
            located(By.xpath("//span[text()='Checkout: Overview']"));

}
