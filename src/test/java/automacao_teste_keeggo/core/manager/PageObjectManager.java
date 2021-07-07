package automacao_teste_keeggo.core.manager;

import org.openqa.selenium.WebDriver;

import automacao_teste_keeggo.test.pages.CadastroPage;
import automacao_teste_keeggo.test.pages.HomePage;
import automacao_teste_keeggo.test.pages.LoginPage;

public class PageObjectManager {

	private WebDriver driver;

	private HomePage home;
	private LoginPage login;
	private CadastroPage cadastro;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (home == null) ? home = new HomePage(driver) : home;
	}
	
	public CadastroPage getCadastroPage() {
		return (cadastro == null) ? cadastro = new CadastroPage(driver) : cadastro;
	}
	
	public LoginPage getLoginPage() {
		return (login == null) ? login = new LoginPage(driver) : login;
	}

	

}
