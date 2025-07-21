package co.com.mydemoapp.tasks;

import co.com.mydemoapp.questions.TargetQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.hamcrest.Matchers;

import static co.com.mydemoapp.ui.ConfirmacionCompraUi.TEXTO_CONFIRMACION;
import static co.com.mydemoapp.ui.ConfirmacionCompraUi.TITULO_CONFIRMACION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ConfirmacionCompraTaks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat(TargetQuestion.title(TITULO_CONFIRMACION), Matchers.containsString(TEXTO_CONFIRMACION))
        );
    }

    public static ConfirmacionCompraTaks confirmacionCompraTaks() {
        return new ConfirmacionCompraTaks();
    }
}
