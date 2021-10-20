package ensek;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Triggers all Cucumber tests in this package matches to specified tag.
 * Both .feature and .java/.class files must be in the same package!
 */
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, strict = true,
        tags= {"@feature"},
        features = "src/test/resources/com/ensek",
        glue = {"com/ensek"},
        plugin = {"html:target/cucumber-pretty"}
)
public class RunIT {
}
