package automacao_teste_keeggo.test.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CadastroPage {

	public CadastroPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// ---- ACCOUNT DETAILS ----
	
	@FindBy(xpath = "//input[@name='usernameRegisterPage']")
	private WebElement txtNomeUsuario;
	
	@FindBy(xpath  = "//input[@name='emailRegisterPage']")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//input[@name='passwordRegisterPage']")
	private WebElement txtSenha;
	
	@FindBy(xpath = "//input[@name='confirm_passwordRegisterPage']")
	private WebElement txtConfirmaSenha;
	
	// ---- PERSONAL DETAILS ----
	
	@FindBy(xpath = "//input[@name='first_nameRegisterPage']")
	private WebElement txtPrimeiroNome;
	
	@FindBy(xpath = "//input[@name='last_nameRegisterPage']")
	private WebElement txtUltimoNome;
	
	@FindBy(xpath = "//input[@name='phone_numberRegisterPage']")
	private WebElement txtNumeroTelefone;
	
	// ---- ADDRESS ----
	
	@FindBy(xpath = "//input[@name='cityRegisterPage']")
	private WebElement txtCidade;
	
	@FindBy(xpath = "//input[@name='addressRegisterPage']")
	private WebElement txtEndereco;
	
	@FindBy(xpath = "//input[@name='postal_codeRegisterPage']")
	private WebElement txtCodigoPostal;
	
	@FindBy(xpath = "//input[@name='state_/_province_/_regionRegisterPage']")
	private WebElement txtEstado;
	
	@FindBy(xpath = "//select[@name='countryListboxRegisterPage']")
	private WebElement drpdwn_Pais;
	
	// ---- CHECKBOX AND BUTTON ----
	
	@FindBy(xpath = "//input[@name='allowOffersPromotion']")
	private WebElement chkbxReceive;
	
	@FindBy(xpath = "//input[@name='i_agree']")
	private WebElement chkbxIAgree;
	
	@FindBy(id = "register_btnundefined")
	private WebElement btnRegistrar;
	
	// ---- LOGIC ----

	public void preenchoNomeUsuario(String userName) {
		txtNomeUsuario.sendKeys(userName);
	}
	
	public void preenchoEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void preenchoSenha(String senha) {
		txtSenha.sendKeys(senha);
	}
	
	public void preenchoConfirmacaoSenha(String confirmacaoSenha) {
		txtConfirmaSenha.sendKeys(confirmacaoSenha);
	}
	
	public void preenchoPrimeiroNome(String firstName) {
		txtPrimeiroNome.sendKeys(firstName);
	}
	
	public void preenchoUltimoNome(String lastName) {
		txtUltimoNome.sendKeys(lastName);
	}
	
	public void preenchoNumeroTelefone(String telefone) {
		txtNumeroTelefone.sendKeys(telefone);
	}
	
	public void selecionoPais(String país) {
		Select select = new Select(drpdwn_Pais);
		select.selectByVisibleText(país);
	}
	
	public void preenchoCidade(String cidade) {
		txtCidade.sendKeys(cidade);
	}	
	
	public void preenchoEndereco(String endereço) {
		txtEndereco.sendKeys(endereço);
	}	
	
	public void preenchoCodigopostal(String codigoPostal) {
		txtCodigoPostal.sendKeys(codigoPostal);
	}	
	
	public void preenchoEstado(String estado) {
		txtEstado.sendKeys(estado);
	}
	
	public void clicoCheckBoxReceive() {
		chkbxReceive.click();
	}
	
	public void clicoCheckBoxIAgree() {
		chkbxIAgree.click();
	}
	
	public void clicoRegistraUsario() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		btnRegistrar.sendKeys(Keys.ENTER);
	}
	
	public void DadosNovoCadastro() {
		preenchoNomeUsuario("JulioCMartins");
		preenchoEmail("julioCezar@test1.com");
		preenchoSenha("M@TinsC&zar2");
		preenchoConfirmacaoSenha("M@TinsC&zar2");
		preenchoPrimeiroNome("Julio Cezar");
		preenchoUltimoNome("Martins");
		preenchoNumeroTelefone("+55 (11) 99123-4321");
		selecionoPais("Brazil");
		preenchoCidade("São Paulo");
		preenchoEndereco("Rua Teste do Teste");
		preenchoCodigopostal("09852-330");
		preenchoEstado("São Paulo");
	}
}