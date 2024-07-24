package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Dado("acesso login")
    public void acesso_login() {
        homePage.acessarLogin();
    }

    @Quando("preencho o formulário de login de usuário")
    public void preencho_o_formulário_de_login_de_usuário() {
        loginPage.inserirNome("vitor.hugo.martins@embraer.com");
        loginPage.inserirSenha("p2tQsm5HHN");
    }

    @Quando("clico em Login")
    public void clico_em_login() throws InterruptedException {
        loginPage.botaoLogin();
    }

    @Então("vejo a mensagem Login realizado")
    public void vejo_a_mensagem_login_realizado() {
        loginPage.validaMenssagemLoginSucesso();
    }

}
