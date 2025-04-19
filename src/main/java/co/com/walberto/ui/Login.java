package co.com.walberto.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login extends PageObject {

    public static final Target INPUT_USERNAME= Target.the("Campo para ingresar el usuario").
            located(By.id("user-name"));
    public static final Target INPUT_PASSWORD= Target.the("Campo para ingresar contraseña").
            located(By.id("password"));

    public static final Target BTN_LOGIN = Target.the("Boton para ingresar al login desues de poner usuario y contraseña").
            located(By.cssSelector(".submit-button.btn_action"));

    public static final  Target MSJ_USUARIO_O_PASSWORD_INCORRECTO = Target.the("Cuando ingresamos alguna de las credenciles incorrectas").
            located(By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']"));


}
