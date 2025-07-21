package co.com.mydemoapp.tasks;

import co.com.mydemoapp.questions.TargetQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.hamcrest.Matchers;

import static co.com.mydemoapp.ui.VerificacionOrdenUi.TITULO_VERIFICACION;
import static co.com.mydemoapp.ui.VerificacionOrdenUi.TEXTO_VERIFICACION;
import static co.com.mydemoapp.ui.VerificacionOrdenUi.BTN_REALIZAR_COMPRA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class VerificacionTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.should(
                seeThat(TargetQuestion.title(TITULO_VERIFICACION), Matchers.containsString(TEXTO_VERIFICACION))
        );
        actor.attemptsTo(
                Click.on(BTN_REALIZAR_COMPRA)
        );

    }
    public static VerificacionTasks verificacionTasks(){
        return new VerificacionTasks();}
}
