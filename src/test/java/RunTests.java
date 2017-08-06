import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Owner on 02/08/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources",
        tags = {"@wip","~@suite"},
        format = {"pretty","html:target/htmlreport"}
)
public class RunTests {
}
