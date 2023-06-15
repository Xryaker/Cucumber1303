package WikiSteps;

import configuration.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyStepdefs extends BaseClass {
    @Then("chcke button History {string}")
    public void chckeButtonHistory(String read) {
        System.out.println("dddd");
       //Assert.assertEquals(driver.findElement(By.id("ca-view")).getText(),read);
    }
}
