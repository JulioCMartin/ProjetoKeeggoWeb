package automacao_teste_keeggo.core.cucumber;

import automacao_teste_keeggo.core.manager.PageObjectManager;
import automacao_teste_keeggo.core.manager.WebDriverManager;

public class TestContext {

	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	public ScenarioContext scenarioContext;

	public TestContext() {
		
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		scenarioContext = new ScenarioContext();
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
}
