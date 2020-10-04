package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@teste",
        features = "src/test/resources/features/pokemon.feature",
        glue = {"steps.pokemon"},
        plugin = {"pretty",
                "html:target/cucumber-pretty.html",
                "json:target/cucumber.json"},
        snippets = CAMELCASE,
        monochrome = true
        )
public class PokemonRunner {

}
