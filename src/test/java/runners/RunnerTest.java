package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@teste",
        features = "src/test/resources/features/test.feature",
        glue = {"src.java.steps.StepsTest"},
        snippets = CAMELCASE,
        plugin = {
                "pretty"
        })
public class RunnerTest{

}
