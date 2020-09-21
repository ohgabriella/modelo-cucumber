package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@teste",
        features = "src/test/resources/features/test.feature",
        glue = {"steps"},
        snippets = CAMELCASE,
        plugin = {"pretty", "html:target/cucumber"})
public class RunnerTest{

}
