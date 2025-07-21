package co.com.mydemoapp.tasks;

import co.com.mydemoapp.questions.TargetQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.hamcrest.Matchers;

import static co.com.mydemoapp.ui.CarritoPageUi.BTN_CONTINUAR_PAGO;
import static co.com.mydemoapp.ui.DireccionEnvioPageUi.TEXTO_DIRECCION;
import static co.com.mydemoapp.ui.DireccionEnvioPageUi.TITULO_DIRECCION;
import static co.com.mydemoapp.ui.DireccionEnvioPageUi.NOMBRE_FIELD;
import static co.com.mydemoapp.ui.DireccionEnvioPageUi.DIRECCION1_FIELD;
import static co.com.mydemoapp.ui.DireccionEnvioPageUi.DIRECCION2_FIELD;
import static co.com.mydemoapp.ui.DireccionEnvioPageUi.CIUDAD_FIELD;
import static co.com.mydemoapp.ui.DireccionEnvioPageUi.REGION_FIELD;
import static co.com.mydemoapp.ui.DireccionEnvioPageUi.CODIGO_POSTAL_FIELD;
import static co.com.mydemoapp.ui.DireccionEnvioPageUi.PAIS_FIELD;
import static co.com.mydemoapp.ui.DireccionEnvioPageUi.BTN_PAGAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DirreccionTaks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CONTINUAR_PAGO)
        );
        actor.should(
                seeThat(TargetQuestion.title(TITULO_DIRECCION), Matchers.containsString(TEXTO_DIRECCION))
        );

        actor.attemptsTo(
                SendKeys.of("ANDRES DAVID SUAREZ GOMEZ").into(NOMBRE_FIELD),
                SendKeys.of("CALLE 123 # 5 - 6").into(DIRECCION1_FIELD),
                SendKeys.of("TORRE 01 APTO 400").into(DIRECCION2_FIELD)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                SendKeys.of("BOGOTA").into(CIUDAD_FIELD),
                SendKeys.of("BOGOTA").into(REGION_FIELD),
                SendKeys.of("11001").into(CODIGO_POSTAL_FIELD),
                SendKeys.of("COLOMBIA").into(PAIS_FIELD),
                Click.on(BTN_PAGAR)
        );

    }
    public static DirreccionTaks dirreccionTaks() {
        return new DirreccionTaks();}
}
