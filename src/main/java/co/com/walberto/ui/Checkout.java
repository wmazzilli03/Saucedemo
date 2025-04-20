package co.com.walberto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Checkout extends Object {


    public static final Target INPUT_FIRST_NAME = Target.the("Nombre del usuario en el formulario").
            located(By.id("first-name"));

    public static final Target INPUT_LAST_NAME = Target.the("Apellido del cliente en el formulario").
            located(By.id("last-name"));

    public static final Target INPUT_ZIP_CODE = Target.the("Ingresamos el ZIPCODE").
            located(By.id("postal-code"));

    public static final Target BTN_CONTINUAR = Target.the("Btn para continuar el flujo").
            located(By.id("continue"));


}
