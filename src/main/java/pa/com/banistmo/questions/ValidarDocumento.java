package pa.com.banistmo.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import org.openqa.selenium.WebDriver;


public class ValidarDocumento implements Question<Boolean>{

    private String titulo;
    public ValidarDocumento(String titulo){
        this.titulo = titulo;
    }
    public static ValidarDocumento deinformacion(String titulo){
        return new ValidarDocumento(titulo);
    }
    @Override
    public Boolean answeredBy (Actor actor){
        try {
            Thread.sleep(6*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriver driver = BrowsingTheWeb.as(actor).getDriver();
        String url = driver.getCurrentUrl();
        return url.contains(titulo);
    }
}
