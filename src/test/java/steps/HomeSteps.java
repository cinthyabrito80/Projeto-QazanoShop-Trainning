package steps;

import io.cucumber.java.pt.Dado;
import pages.HomePage;
import runner.RunBase;
import runner.RunCucumberTest;

public class HomeSteps extends RunCucumberTest {

    HomePage homepage = new HomePage();

    @Dado("que estou no site QazanoShop")
    public void que_estou_no_site_QazanoShop() {
        getDriver(Browser.CHROME);
        homepage.acassarSiteQazanoShop();
    }
}
