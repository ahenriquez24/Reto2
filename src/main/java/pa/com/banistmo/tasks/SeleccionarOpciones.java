package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pa.com.banistmo.interactions.SwitchWindowTab;
import pa.com.banistmo.userinterface.BuscarOpciones;

public class SeleccionarOpciones implements Task{
    public static SeleccionarOpciones enpagina(){
        return Tasks.instrumented(SeleccionarOpciones.class);
    }
    @Override
    public  <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(BuscarOpciones.OPCION_APRENDER),
                Click.on(BuscarOpciones.OPCION_LEGALES),
                Click.on(BuscarOpciones.OPCION_FATCA),
                Click.on(BuscarOpciones.DECARGAR_PDF),
                SwitchWindowTab.change()

        );
    }
}
