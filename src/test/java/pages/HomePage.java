package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import runner.RunCucumberTest;
import support.Utils;

public class HomePage extends RunCucumberTest {

    private By logo_home = By.xpath("//*[@href='index.html']");
    private By link_login = By.xpath("//*[text()=' Login']");
    private By link_cadastro = By.xpath("//*[text()=' Cadastro']");


    public void acassarSiteQazanoShop() {
        getDriver().get("https://automationpratice.com.br/");
    }

    public void acessarLogin() {
        Utils.esperarElementoVisivel(link_login, 20);
        getDriver().findElement(link_login).click();
    }

    public void acessarCadastro() {
        Utils.esperarElementoVisivel(link_cadastro, 20);
        getDriver().findElement(link_cadastro).click();
    }

}
