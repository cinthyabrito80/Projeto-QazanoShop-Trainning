package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;
import pages.HomePage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    HomePage homePage = new HomePage();
    CadastroPage cadastroPage = new CadastroPage();

    @Dado("acesso cadastro de usuário")
    public void acesso_cadastro_de_usuário() {
        homePage.acessarCadastro();
        cadastroPage.validaTelaCadastro();
    }
    @Quando("preencho o formulário de cadastro de usuário")
    public void preencho_o_formulário_de_cadastro_de_usuário() {
        cadastroPage.inserirNome();
        cadastroPage.inserirEmail();
        cadastroPage.inserirSenha();
    }
    @Quando("clico em Cadastrar")
    public void clico_em_cadastrar() throws InterruptedException {
        cadastroPage.botaoCadastrar();
    }
    @Então("vejo a mensagem Cadastro realizado")
    public void vejo_a_mensagem_cadastro_realizado() {
        cadastroPage.validaMenssagemCadastroSucesso();
        cadastroPage.botaoOk();
    }
}
