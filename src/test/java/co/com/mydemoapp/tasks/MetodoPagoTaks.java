package co.com.mydemoapp.tasks;

import co.com.mydemoapp.interactions.Espera;
import co.com.mydemoapp.questions.TargetQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.hamcrest.Matchers;

import static co.com.mydemoapp.ui.MetodoPagoPageUi.TEXTO_METODOPAGO;
import static co.com.mydemoapp.ui.MetodoPagoPageUi.TITULO_METODOPAGO;
import static co.com.mydemoapp.ui.MetodoPagoPageUi.NOMBRE_CC_FIELD;
import static co.com.mydemoapp.ui.MetodoPagoPageUi.NUMERO_TARJETA_FIELD;
import static co.com.mydemoapp.ui.MetodoPagoPageUi.FECHA_VENCIMIENTO_FIELD;
import static co.com.mydemoapp.ui.MetodoPagoPageUi.CCV_FIELD;
import static co.com.mydemoapp.ui.MetodoPagoPageUi.BTN_VERIFICAR_ORDEN;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MetodoPagoTaks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat(TargetQuestion.title(TITULO_METODOPAGO), Matchers.containsString(TEXTO_METODOPAGO))
        );
        actor.attemptsTo(
                SendKeys.of("ANDRES DAVID SUAREZ GOMEZ").into(NOMBRE_CC_FIELD),
                SendKeys.of("325812657568788").into(NUMERO_TARJETA_FIELD)
        );
        Espera.cargador(5);
        actor.attemptsTo(
                SendKeys.of("0430").into(FECHA_VENCIMIENTO_FIELD),
                SendKeys.of("321").into(CCV_FIELD),
                Click.on(BTN_VERIFICAR_ORDEN)
        );
    }

    public static MetodoPagoTaks metodoPagoTaks() {
        return new MetodoPagoTaks();
    }
}
