package co.com.mydemoapp.steps.stepdefinitions;

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
        InicioSesionStepDefinitions.elUsuarioIngresaSuUsuarioContrasenaYIntenteLogesarse(USUARIO,CONTRASENA);
        InicioSesionStepDefinitions.laAppDebeConfirmarleElInicioDeSesionExitoso();

    }
    @When("Seleccione un producto a comprar")
    public static void seleccioneUnProductoAComprar() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                SeleccionProductoTasks.seleccionProductoTasks()
        );
        Thread.sleep(5000);
    }

    @Then("se debe visualizar el articulo en el carrito de forma exitosa")
    public static void seDebeVisualizarElArticuloEnElCarritoDeFormaExitosa() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                ValidacionCarritoTasks.validacionCarritoTasks()
        );
        Thread.sleep(5000);
    }
}
