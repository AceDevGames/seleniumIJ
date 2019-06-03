import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/alugarFilme.feature",
        glue = "src/teste/java/stepdef",
        plugin = "pretty",
        monochrome = true ,
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = false
)
public class Runner {
}
