package co.com.mydemoapp.tasks;

import co.com.mydemoapp.interactions.Espera;
import co.com.mydemoapp.questions.TargetQuestion;
import co.com.mydemoapp.utils.ScrollToText;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.hamcrest.Matchers;

import static co.com.mydemoapp.ui.ProductoPageUi.BTN_AGREGAR_ARTICULO;
import static co.com.mydemoapp.ui.ProductoPageUi.BTN_ARTICULO;
import static co.com.mydemoapp.ui.ProductoPageUi.TEXTO_BTN_AGREGAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SeleccionProductoTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ARTICULO)
        );
        Espera.cargador(5);
        actor.attemptsTo(
                ScrollToText.containing("Add To Cart")
        );
        Espera.cargador(5);
        actor.should(
                seeThat(TargetQuestion.title(BTN_AGREGAR_ARTICULO), Matchers.containsString(TEXTO_BTN_AGREGAR))
        );
        actor.attemptsTo(
                Click.on(BTN_AGREGAR_ARTICULO)
        );

    }

    public static SeleccionProductoTasks seleccionProductoTasks() {

        return new SeleccionProductoTasks();
    }

}
