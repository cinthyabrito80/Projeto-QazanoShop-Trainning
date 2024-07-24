package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber/cucumberReport.html","json:target/reports/cucumberReport.json"},
        features = "src/test/resources/features",
        tags = "",
        glue = {"steps"}
)
public class RunCucumberTest extends RunBase{


    @AfterClass
    public static void stop(){
        System.out.println("Finalizou");
        driver.quit();
    }

}
