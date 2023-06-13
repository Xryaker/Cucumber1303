package steps;

import configuration.BaseClass;
import configuration.DriverFactory;
import configuration.WEBDRIVERS;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import page.HillelPage;

import java.util.List;


public class MainPageSteps extends BaseClass {
    static HillelPage hillelPage;

    static {
        hillelPage = PageFactory.initElements(driver, HillelPage.class);
    }

    @When("^I open site$")
    public void iOpenSite() {
        if (!driver.getCurrentUrl().equals("https://dnipro.ithillel.ua/")) {
            driver.get("https://dnipro.ithillel.ua/");
        }
    }

    @And("Click consultation button")
    public void clickConsultationButton() {
        hillelPage.getCunsultButton().click();
    }

    @Then("Check open form")
    public void checkOpenForm() {
        Assert.assertTrue(driver.findElement(By.id("form-consultation")).isEnabled());
    }

    @Then("Check title")
    public void checkTitle() {
        System.out.println(hillelPage.getTitle());
    }

    @When("I open site {string}")
    public void iOpenSite(String link) {
        if (!driver.getCurrentUrl().equals(link)) {
            driver.get(link);
        }
    }

    @And("I sent Name {string} and Family {string}")
    public void iSentNameAndFamily(String name, String family) {
        System.out.println(name+family);
    }


    @Then("Title page")
    public void titlePage() {
        System.out.println(driver.getTitle());
    }

    @Then("sout {string}")
    public void sout(String name) {
        System.out.println(name);
    }

    @When("I open site {string} and {string}")
    public void iOpenSiteAnd(String lan, String name) {
        iOpenSite("https://"+lan+"."+name+"/");
    }
}
