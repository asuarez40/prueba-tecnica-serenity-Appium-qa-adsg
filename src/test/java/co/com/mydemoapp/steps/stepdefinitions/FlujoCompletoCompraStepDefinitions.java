package co.com.mydemoapp.steps.stepdefinitions;

import co.com.mydemoapp.interactions.Espera;
import co.com.mydemoapp.tasks.ConfirmacionCompraTaks;
import co.com.mydemoapp.tasks.DirreccionTaks;
import co.com.mydemoapp.tasks.MetodoPagoTaks;
import co.com.mydemoapp.tasks.VerificacionTasks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoCompletoCompraStepDefinitions {

    @Given("ya tiene seleccionado un articulo a comprar")
    public void yaTieneSeleccionadoUnArticuloAComprar() {
        AgregarProductoStepDefinitions.seleccioneUnProductoAComprar();
        AgregarProductoStepDefinitions.seDebeVisualizarElArticuloEnElCarritoDeFormaExitosa();
    }

    @When("diligencie la informacion de envio, metodo de pago")
    public void diligencieLaInformacionDeEnvioMetodoDePago() {
        theActorInTheSpotlight().attemptsTo(
                DirreccionTaks.dirreccionTaks(),
                MetodoPagoTaks.metodoPagoTaks()
        );
        Espera.cargador(5);
    }

    @And("procese la compra")
    public void proceseLaCompra() {
        theActorInTheSpotlight().attemptsTo(
                VerificacionTasks.verificacionTasks()
        );
        Espera.cargador(5);
    }

    @Then("se debe visualizar la confirmación del pedido exitoso")
    public void seDebeVisualizarLaConfirmacionDelPedidoExitoso() {
        theActorInTheSpotlight().attemptsTo(
                ConfirmacionCompraTaks.confirmacionCompraTaks()
        );
        Espera.cargador(5);
    }
}
