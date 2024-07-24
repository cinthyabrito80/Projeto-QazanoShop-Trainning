#language: pt

  Funcionalidade: Cadastro de usuário
    Eu como novo usuários
    Quero me cadastrar na aplicação
    Para pode efetuar uma compra

    @cadastrousuariosucesso
    Cenário: Registrar um novo usuário com sucesso
      Dado que estou no site QazanoShop
      E acesso cadastro de usuário
      Quando preencho o formulário de cadastro de usuário
      E clico em Cadastrar
      Então vejo a mensagem Cadastro realizado