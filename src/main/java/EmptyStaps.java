import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.reflect.Type;
import java.util.List;

public class EmptyStaps {
    @When("Print some text")
    public void printSomeText() {
        System.out.println("Print some text");
    }

    @Then("Result")
    public void result() {
        System.out.println("result");
    }

    @When("Print some text {string}")
    public void printSomeText(String text) {
        System.out.println("Print some text : "+ text);
    }

    @And("Print some {string} and {string}")
    public void printSomeAnd(String name, String family) {
        System.out.println("Print name : "+ name+ " family : "+family);
    }
    @Before("@Vasiliy")
    public void prints(){
        System.out.println("Hello");
    }


    @When("Print some texts")
    public void printSomeTexts(DataTable dataTable) {
        List<String> table=dataTable.asList(String.class);
        for (String s : table) {
            System.out.println(s);
        }

    }

    @When("print some table")
    public void printSomeTable(DataTable dataTable) {
        List<List<String>> table=dataTable.asLists();
        for (List<String> stringList : table) {
            System.out.println("Name : "+stringList.get(0)+"family : "+stringList.get(1));
        }
    }

    @When("Isen login {string} and Pass {string}")
    public void isenLoginAndPass(String login, String pass) {
        System.out.println("Login : "+ " password : "+pass);
    }

    @Then("I check resul {string}")
    public void iCheckResul(String expected) {
        Assert.assertEquals(Boolean.valueOf(expected),true);
    }
}
