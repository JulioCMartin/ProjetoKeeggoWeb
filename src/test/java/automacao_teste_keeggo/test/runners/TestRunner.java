package automacao_teste_keeggo.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",
		glue = "automacao_teste_keeggo.test.steps",
		tags = "@CadastroNovoUsuario",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false)

public class TestRunner {

}
