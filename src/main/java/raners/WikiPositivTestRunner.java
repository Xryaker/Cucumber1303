package raners;

import configuration.BaseClass;
import configuration.DriverFactory;
import configuration.WEBDRIVERS;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import java.time.Duration;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features",//path to feature files
        glue = "steps",//package path
        tags = "@WIKI",//list feature files for run
        dryRun = false

)
public class WikiPositivTestRunner {
    @BeforeClass
    public static void create() {
      BaseClass.create();
    }

    @AfterClass
    public static void end() throws InterruptedException {
      BaseClass.end();
    }


}
