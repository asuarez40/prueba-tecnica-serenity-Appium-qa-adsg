package co.com.mydemoapp.tasks;

import co.com.mydemoapp.questions.TargetQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.hamcrest.Matchers;

import static co.com.mydemoapp.ui.CarritoPageUi.BTN_CARRITO;
import static co.com.mydemoapp.ui.CarritoPageUi.TITULO_ARTICULO;
import static co.com.mydemoapp.ui.CarritoPageUi.TEXTO_ARTICULO_SELECCIONADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ValidacionCarritoTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_CARRITO)
        );
        actor.should(
                seeThat(TargetQuestion.title(TITULO_ARTICULO), Matchers.containsString(TEXTO_ARTICULO_SELECCIONADO))
        );

    }

    public static ValidacionCarritoTasks validacionCarritoTasks() {
        return new ValidacionCarritoTasks();
    }
}
