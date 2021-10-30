package pa.com.banistmo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarOpciones extends PageObject {

    public static final Target OPCION_APRENDER =Target.the("Opcion aprender es facil").located(By.xpath("//a[@href=\"/wps/portal/banistmo/personas/aprender-es-facil/\"]"));
    public static final Target OPCION_LEGALES =Target.the("Ir a legales").located(By.xpath("//a[@href=\"/wps/portal/banistmo/personas/aprender-es-facil/legales/\"]"));
    public static final Target OPCION_FATCA =Target.the("Ir a FATCA & CRS").located(By.xpath("//a[@href=\"/wps/portal/banistmo/personas/aprender-es-facil/legales/fatca/\"]"));
    public static final Target DECARGAR_PDF =Target.the("Descargar PDF").located(By.xpath("//a[@href=\"/wps/wcm/connect/www.banistmo.com11237/ad2e205d-52e5-477f-8eaa-26fc66d73509/PJ+Autocertificacion+unificado-+Fatca+y+CRS.pdf?MOD=AJPERES&CVID=mCx33X-\"]"));

}
