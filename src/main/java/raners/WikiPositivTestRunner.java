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
        tags = "@CERTIFICATE",//list feature files for run
        dryRun = false,
        publish = true

)
public class WikiPositivTestRunner {
    @BeforeClass
    public static void create() {
        System.setProperty("CUCUMBER_PUBLISH_ENABLED", "943f2e6f-68e5-43a4-9507-cc53c4d0d778");
        BaseClass.create();
    }

    @AfterClass
    public static void end() throws InterruptedException {
        BaseClass.end();
    }

}
