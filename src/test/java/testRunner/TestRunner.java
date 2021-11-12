package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {
//                "Features/ABTesting.feature",
                  "Features/AddRemove.feature"
        },
        plugin = {
                "pretty"
        },
        glue = "stepDefinitions"


)

public class TestRunner {
}
