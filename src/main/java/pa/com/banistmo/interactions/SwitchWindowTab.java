package pa.com.banistmo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class SwitchWindowTab implements Task {
    private static final Logger log = LoggerFactory.getLogger(SwitchWindowTab.class);
    public SwitchWindowTab(){
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        WebDriver driver = BrowsingTheWeb.as(actor).getDriver();
        String currHandle = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();
        log.debug("Open Windows:"+allHandles.size());
        log.debug("Current Windows:"+currHandle);
        for (String handle:allHandles){
            if(!handle.contentEquals(currHandle)){
                driver.switchTo().window(handle);
                break;
            }
        }
        log.debug("new windows:"+driver.getWindowHandle());
    }
    public static SwitchWindowTab change(){ return Tasks.instrumented(SwitchWindowTab.class);}
 }
