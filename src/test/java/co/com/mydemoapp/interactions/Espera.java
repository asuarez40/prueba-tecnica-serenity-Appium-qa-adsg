package co.com.mydemoapp.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Espera implements Interaction {

    private long seconds;
    private final Logger logger = LoggerFactory.getLogger(Espera.class);

    public Espera(long seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            logger.error("Error: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }

    public static Performable cargador(int segundos) {
        return Instrumented.instanceOf(Espera.class).withProperties(segundos);
    }
}
