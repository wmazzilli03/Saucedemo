package co.com.walberto.questions;

import co.com.walberto.utils.Times;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.walberto.ui.Overview.TXT_MSJ_FINAL;
import static co.com.walberto.utils.Constantes.TIME_SHORT;

public class VistaFinalizarFlujo implements Question<Boolean> {

    private String msj;
    public VistaFinalizarFlujo(String msj){
        this.msj = msj;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String validar = TXT_MSJ_FINAL.resolveFor(actor).getText();
        Times.waiting(TIME_SHORT);
        return this.msj.equals(validar);

    }

    public static VistaFinalizarFlujo msjDespedida(String msj) {
        return new VistaFinalizarFlujo(msj);
    }

}
