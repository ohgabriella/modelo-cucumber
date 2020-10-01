package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@AllCenarios",
        features = "src/test/resources/features/pokemon.feature",
        glue = {"steps.pokemon"},
        snippets = CAMELCASE,
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true)
public class PokemonRunner {

}
