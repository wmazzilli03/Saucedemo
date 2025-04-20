package co.com.walberto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Overview extends Object{

    public static final Target BTN_FINISH  = Target.the("El btn finaliza el flujo en saucedemo").
            located(By.id("finish"));

    public static final Target TXT_MSJ_FINAL = Target.the("Msj de gracias en el flujo de sausedemo").
            located(By.xpath("//h2[text()='Thank you for your order!']"));
}
