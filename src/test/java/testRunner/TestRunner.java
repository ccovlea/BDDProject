package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {
//                "Features/ABTesting.feature",
//                  "Features/AddRemove.feature",
//                "Features/Auth.feature",
//                "Features/Challenging_DOM.feature",
//                "Features/Checkboxes.feature",
                "Features/Context.feature"
        },
        plugin = {
                "pretty",
//                "json:target/report.json",
//                "html:target/report.html"
        },
        glue = "stepDefinitions"


)

public class TestRunner {
}
