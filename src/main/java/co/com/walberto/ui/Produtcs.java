package co.com.walberto.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Produtcs extends PageObject {

    public static final Target TITLE_PRODUCTS = Target.the("Titulo de la pagina principal de productos").
            located(By.xpath("//div[text()='Swag Labs']"));

}
