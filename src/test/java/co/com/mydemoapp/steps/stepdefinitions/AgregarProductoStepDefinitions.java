package co.com.mydemoapp.steps.stepdefinitions;

import co.com.mydemoapp.interactions.Espera;
import co.com.mydemoapp.tasks.SeleccionProductoTasks;
import co.com.mydemoapp.tasks.ValidacionCarritoTasks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.mydemoapp.utils.Constantes.CONTRASENA;
import static co.com.mydemoapp.utils.Constantes.USUARIO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarProductoStepDefinitions {

    @Given("el usuario se encuentra autenticado")
    public void elUsuarioSeEncuentraAutenticado() throws InterruptedException {
        InicioSesionStepDefinitions.elUsuarioSeEncuentraEnLaPantallaDeInicioDeSesion();
        InicioSesionStepDefinitions.elUsuarioIngresaSuUsuarioContrasenaYIntenteLogesarse(USUARIO, CONTRASENA);
        InicioSesionStepDefinitions.laAppDebeConfirmarleElInicioDeSesionExitoso();

    }

    @When("Seleccione un producto a comprar")
    public static void seleccioneUnProductoAComprar() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionProductoTasks.seleccionProductoTasks()
        );
        Espera.cargador(5);
    }

    @Then("se debe visualizar el articulo en el carrito de forma exitosa")
    public static void seDebeVisualizarElArticuloEnElCarritoDeFormaExitosa() {
        theActorInTheSpotlight().attemptsTo(
                ValidacionCarritoTasks.validacionCarritoTasks()
        );
        Espera.cargador(5);

    }
}
