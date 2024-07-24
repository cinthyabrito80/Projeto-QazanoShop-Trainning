package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import runner.RunCucumberTest;
import support.Utils;

import static java.lang.Character.getName;
import static support.Utils.getEmail;
import static support.Utils.getPassword;

public class CadastroPage extends RunCucumberTest {

    //-- formulário de cadastro
    private By valida_tela_cadastro = By.xpath("//*[text()='Cadastro de usuário']");
    private By inserir_nome = By.id("user");
    private By inserir_email = By.id("email");
    private By inserir_senha = By.id("password");
    private By btn_cadastrar = By.id("btnRegister");

    //-- Valida mensagem de sucesso no popup
    private By valida_popup_cadastro_sucesso = By.xpath("//*[text()='Cadastro realizado!']");
    private By btn_ok = By.xpath("//*[text()='OK']");


    public void validaTelaCadastro() {
        Utils.esperarElementoVisivel(valida_tela_cadastro,20);
        String textoElemento = getDriver().findElement(valida_tela_cadastro).getText();
        Assert.assertEquals("Cadastro de usuário",textoElemento);
    }

    public void inserirNome() {
        Utils.esperarElementoVisivel(inserir_nome,20);
        getDriver().findElement(inserir_nome).sendKeys(Utils.getName());
    }

    public void inserirEmail() {
        Utils.esperarElementoVisivel(inserir_email,20);
        getDriver().findElement(inserir_email).sendKeys(getEmail());
    }

    public void inserirSenha() {
       Utils.esperarElementoVisivel(inserir_senha,20);
        getDriver().findElement(inserir_senha).sendKeys(getPassword());
    }

    public void botaoCadastrar() throws InterruptedException {
        //esperarElementoVisivel(btn_cadastrar,20);
        //driver.findElement(btn_cadastrar).click();

        WebElement element = getDriver().findElement(btn_cadastrar);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", element);
        Thread.sleep(2000);
        Assert.assertEquals("Não exibiu o botão",true, getDriver().findElement(btn_cadastrar).isDisplayed());
        getDriver().findElement(btn_cadastrar).click();
    }

    public void validaMenssagemCadastroSucesso() {
        Utils.esperarElementoVisivel(valida_popup_cadastro_sucesso,100);
        String msgElemento = getDriver().findElement(valida_popup_cadastro_sucesso).getText();
        Assert.assertEquals("Cadastro realizado!",msgElemento);
    }

    public void botaoOk() {
        Utils.esperarElementoVisivel(btn_ok,20);
        getDriver().findElement(btn_ok).click();
    }
}
