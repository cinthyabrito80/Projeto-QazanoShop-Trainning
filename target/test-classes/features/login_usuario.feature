#language: pt

  Funcionalidade: Login de usuário
    Eu como usuária
    Quero logar no site Qazano shop
    Para ter acesso a minhas compras, etc

  @loginacessosucesso
  Cenário: Fazer login com usario e senha validos
    Dado que estou no site QazanoShop
    E acesso login
    Quando preencho o formulário de login de usuário
    E clico em Login
    Então vejo a mensagem Login realizado