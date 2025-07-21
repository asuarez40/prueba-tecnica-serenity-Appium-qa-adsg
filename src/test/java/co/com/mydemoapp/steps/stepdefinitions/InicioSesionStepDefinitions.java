package co.com.mydemoapp.steps.stepdefinitions;

import co.com.mydemoapp.interactions.Espera;
import co.com.mydemoapp.questions.TargetQuestion;
import co.com.mydemoapp.tasks.LoginTasks;
import co.com.mydemoapp.tasks.NavegacionTasks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static co.com.mydemoapp.ui.LoginPageUi.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioSesionStepDefinitions {

    @Given("el usuario se encuentra en la pantalla de inicio de sesion")
    public static void elUsuarioSeEncuentraEnLaPantallaDeInicioDeSesion() {
        theActorInTheSpotlight().attemptsTo(
                NavegacionTasks.navegar()
        );
        Espera.cargador(5);

    }

    @When("el usuario ingresa su usuario {string} , contrasena {string} e intente logesarse")
    public static void elUsuarioIngresaSuUsuarioContrasenaYIntenteLogesarse(String usuario, String contrasena) {
        theActorInTheSpotlight().attemptsTo(
                LoginTasks.login(usuario, contrasena)
        );
        Espera.cargador(5);

    }

    @Then("la app debe confirmarle el inicio de sesion exitoso")
    public static void laAppDebeConfirmarleElInicioDeSesionExitoso() {

        theActorInTheSpotlight().should(seeThat(
                TargetQuestion.title(TITULO_LOGIN_EXITOSO), Matchers.containsString(TEXTO_LOGIN_EXITOSO)
        ));
        Espera.cargador(5);

    }

    @Then("la app debe mostrar un mensaje de rechazo y no dejar ingresar")
    public void laAppDebeMostrarUnMensajeDeRechazoYNoDejarIngresar() {
        theActorInTheSpotlight().should(seeThat(
                TargetQuestion.title(TITULO_LOGIN_FALLIDO), Matchers.containsString(TEXTO_LOGIN_FALLIDO)
        ));
        Espera.cargador(5);
    }
}
