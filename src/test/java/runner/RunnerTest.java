package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;;
import support.DriverQA;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src"},
        snippets = SnippetType.CAMELCASE,
        plugin = {"json:target/reports/CucumberReport.json", "pretty", "html:target/report-html"},
        monochrome = false,
        dryRun = false,
        glue = {"steps", "support"},
        tags = {"~@ignore","@telaVortx"})

public class RunnerTest extends DriverQA{

}
