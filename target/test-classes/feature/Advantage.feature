#language:pt
#coding:utf-8
Funcionalidade: Login e Cadastro

  Contexto: 
    Dado acesso site Advantage Online Shopping 
    
  @CadastroNovoUsuario
  Cenario: Cadastro novo usuario
  	Quando clicar em login
  	E clico em novo usuario
		Quando inserir detalhes da conta
    Então entrar na conta cadastrada

  @ValidaLoginUsuario
  Cenario: Login usuario
    Quando clicar em login
    E inserir dados do usuario
    Então valido login com sucesso
