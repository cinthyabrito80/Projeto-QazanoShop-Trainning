package steps;

import io.cucumber.java.pt.Dado;
import pages.HomePage;
import runner.RunCucumberTest;

public class HomeSteps extends RunCucumberTest {

    HomePage homepage = new HomePage(driver);

    @Dado("que estou no site QazanoShop")
    public void que_estou_no_site_QazanoShop() {
        homepage.acassarSiteQazanoShop();
    }
}
