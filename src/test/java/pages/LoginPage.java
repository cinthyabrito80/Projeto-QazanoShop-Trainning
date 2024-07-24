package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import runner.RunCucumberTest;
import support.Utils;

public class LoginPage extends RunCucumberTest {

    //-- formulário de login
    private By valida_tela_login = By.cssSelector("#login_area > div > div > div > div > h3");
    private By inserir_email_login = By.id("user");
    private By inserir_senha_login = By.id("password");
    private By btn_login = By.id("btnLogin");

    //-- Valida mensagem de sucesso no popup
    private By valida_popup_login_sucesso = By.xpath("//*[text()='Login realizado']");
    private By btn_ok = By.xpath("//*[text()='OK']");



    public void validaTelaLogin() {
        Utils.esperarElementoVisivel(valida_tela_login,20);
        String textoElemento = getDriver().findElement(valida_tela_login).getText();
        Assert.assertEquals("Login",textoElemento);
    }

    public void inserirNome(String email) {
        Utils.esperarElementoVisivel(inserir_email_login,20);
        getDriver().findElement(inserir_email_login).sendKeys(email);
    }

    public void inserirSenha(String senha) {
        Utils.esperarElementoVisivel(inserir_senha_login,20);
        getDriver().findElement(inserir_senha_login).sendKeys(senha);
    }

    public void botaoLogin() throws InterruptedException {
        WebElement element = getDriver().findElement(btn_login);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", element);
        Thread.sleep(2000);
        Assert.assertEquals("Não exibiu o botão",true, getDriver().findElement(btn_login).isDisplayed());
        getDriver().findElement(btn_login).click();
    }

    public void validaMenssagemLoginSucesso() {
        Utils.esperarElementoVisivel(valida_popup_login_sucesso,100);
        String msgElemento = getDriver().findElement(valida_popup_login_sucesso).getText();
        Assert.assertEquals("Login realizado",msgElemento);
    }

    public void botaoOk() {
        Utils.esperarElementoVisivel(btn_ok,20);
        getDriver().findElement(btn_ok).click();
    }
}
