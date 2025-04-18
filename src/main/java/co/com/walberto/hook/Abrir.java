package co.com.walberto.hook;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.walberto.utils.Constantes.WEB_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Task {

    private EnvironmentVariables urlNavegador;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String pathWebUrl = EnvironmentSpecificConfiguration.from(urlNavegador).getProperty(WEB_URL);
        actor.attemptsTo(Open.url(pathWebUrl));
    }

    public static Performable elNavegador() {
        return instrumented(Abrir.class);

    }

}
