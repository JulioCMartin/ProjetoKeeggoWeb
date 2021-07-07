package automacao_teste_keeggo.test.steps;


import org.openqa.selenium.WebDriver;

import automacao_teste_keeggo.core.cucumber.TestContext;
import automacao_teste_keeggo.test.pages.CadastroPage;
import automacao_teste_keeggo.test.pages.HomePage;
import automacao_teste_keeggo.test.pages.LoginPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AllSteps {
	
	WebDriver driver;
	TestContext testContext;
	CadastroPage cadastro;
	HomePage home;
	LoginPage login;
	
	public AllSteps(TestContext context) {
		testContext = context;
		cadastro = testContext.getPageObjectManager().getCadastroPage();
		home = testContext.getPageObjectManager().getHomePage();
		login = testContext.getPageObjectManager().getLoginPage();
	}
	
	
	@Dado("^acesso site Advantage Online Shopping$")
	public void acessoSiteAdvantageOnlineShopping(){
		home.navegarParaPaginaPrincipal();
	}

	@Quando("clicar em login")
	public void clicarEmLogin(){
		home.clicaEmLogin();
	}
		
	@Quando("clico em novo usuario")
	public void clico_em_novo_usuario(){
		home.clicaEmNovouUsuario();
	}

	@Quando("inserir detalhes da conta")
	public void inserir_detalhes_da_conta(){
		cadastro.DadosNovoCadastro();
		cadastro.clicoCheckBoxReceive();
		cadastro.clicoCheckBoxIAgree();
		cadastro.clicoRegistraUsario();
	}

	@Então("entrar na conta cadastrada")
	public void entrar_na_conta_cadastrada(){
		testContext.getWebDriverManager().closeDriver();
	}

	@Quando("inserir dados do usuario")
	public void inserirDadosDoUsuario(){
		login.preenchoUsuarioESenha();
		login.clicoLogin();
	}

	@Então("valido login com sucesso")
	public void valido_login_com_sucesso(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		testContext.getWebDriverManager().closeDriver();
	}

}
