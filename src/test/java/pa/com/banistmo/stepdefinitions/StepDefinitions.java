package pa.com.banistmo.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.questions.ValidarDocumento;
import pa.com.banistmo.tasks.AbrirPagina;
import pa.com.banistmo.tasks.SeleccionarOpciones;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepDefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }


    @Dado("^que ingreso a la pagina de banistmo$")
    public void queIngresoALaPaginaDeBanistmo() {
        theActorCalled("Usuario").wasAbleTo(AbrirPagina.banistmo());
    }


    @Cuando("^cargo las opciones de aprender es facil$")
    public void cargoLasOpcionesDeAprenderEsFacil() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpciones.enpagina());
    }


    @Entonces("^verfico el documento \"([^\"]*)\"$")
    public void verficoElDocumento(String titulo) throws Throwable {
        theActorInTheSpotlight().should(seeThat(ValidarDocumento.deinformacion(titulo)));
    }
}
