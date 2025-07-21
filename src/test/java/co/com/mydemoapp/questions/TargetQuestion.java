package co.com.mydemoapp.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TargetQuestion implements Question<String>{
    private final Target text;

    public TargetQuestion(Target text) {
        this.text = text;
    }

    @Override
    public String answeredBy(Actor actor) {
        WebElementFacade tituloElemento = text.resolveFor(actor);
        return tituloElemento.getText();
    }

    public static Question<String> title(Target text) {
        return new TargetQuestion(text);
    }
}
