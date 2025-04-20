package co.com.walberto.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/finalizar.feature",      // Ruta a tus archivos .feature
        glue = "co.com.walberto.stepdefinitions",            // Paquete donde están tus step definitions
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        stepNotifications = true
       // tags = "@outlineCheck"                           // Opcional: filtra los escenarios según el tag
)

public class RunnerFinalizar {
}
