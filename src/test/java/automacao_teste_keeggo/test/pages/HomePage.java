package automacao_teste_keeggo.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import automacao_teste_keeggo.core.manager.FileReaderManager;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// --- HOME ----

	@FindBy(id = "menuUserLink")
	private WebElement btnLogin;

	@FindBy(xpath = "//*[@class='create-new-account ng-scope']")
	private WebElement btnNovoUsuario;
	
	@FindBy(id = "menuUserLink")
	private WebElement vldUsuarioLogado;
	// ---- LOGIC ---
	
	public void navegarParaPaginaPrincipal() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	public void clicaEmLogin() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		btnLogin.click();
	}
	
	public void clicaEmNovouUsuario() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		btnNovoUsuario.sendKeys(Keys.ENTER);
		
	}
	
}
