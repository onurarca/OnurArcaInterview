package weightScale.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "weightScale/tests",
        tags = "@BarWeighTest",
        dryRun = false,
        plugin={"pretty","html:target/CucumberReport"}

)


public class CucumberRunner {

}
