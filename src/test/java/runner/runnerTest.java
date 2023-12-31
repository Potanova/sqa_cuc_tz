package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepDef",
        features = "src/test/java/feature",
        plugin = {"html:target/HTML_report.html"}
)
public class runnerTest {

}
