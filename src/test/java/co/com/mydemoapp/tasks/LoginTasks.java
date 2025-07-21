package co.com.mydemoapp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.com.mydemoapp.ui.LoginPageUi.*;

public class LoginTasks implements Task {

    private final String usuario;
    private final String contrasena;

    public LoginTasks(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(usuario).into(USERNAME_FIELD),
                SendKeys.of(contrasena).into(PASSWORD_FIELD),
                Click.on(BTN_LOGIN)
        );
    }

    public static LoginTasks login(String usuario, String contrasena) {
        return new LoginTasks(usuario, contrasena);
    }
}
