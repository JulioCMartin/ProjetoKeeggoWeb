package automacao_teste_keeggo.test.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// ---- LOGIN ---
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement txtNomeUsuario;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement txtSenha;
	
	@FindBy(id = "sign_in_btnundefined")
	private WebElement btnSignIn;
	
	// ---- LOGIC ---
	
	public void preenchoNomeUsuario(String userName) {
		txtNomeUsuario.sendKeys(userName);
	}
	
	public void preenchoSenha(String senha) {
		txtSenha.sendKeys(senha);
	}
	
	public void clicoLogin() {
		btnSignIn.sendKeys(Keys.ENTER);
	}
	
	public void preenchoUsuarioESenha() {
		preenchoNomeUsuario("JulioCM");
		preenchoSenha("M@TinsC&zar1");
	}
}
