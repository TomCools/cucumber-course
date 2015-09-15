package be.tomcools.bvis.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "be.tomcools.bvis.steps",
        features="src/test/resources"
)
public class RunAllTests {
}
