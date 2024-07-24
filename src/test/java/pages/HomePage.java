package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;
    private By logo_home = By.xpath("//*[@href='index.html']");
    private By link_login = By.xpath("//*[text()='  Login']");
    private By link_cadastro = By.xpath("//*[text()=' Cadastro']");


    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public void acassarSiteQazanoShop() {
        driver.get("https://automationpratice.com.br/");
    }

    public void acessarLogin() {
        esperarElementoVisivel(link_login, 20);
        driver.findElement(link_login).click();
    }

    public void acessarCadastro() {
        esperarElementoVisivel(link_cadastro, 20);
        driver.findElement(link_cadastro).click();
    }

}
