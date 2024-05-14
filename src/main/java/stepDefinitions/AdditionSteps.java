package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AdditionSteps {

    public int number;

    @Given("I take 5")
    public void pressNumberFive() {
        number = 5;
    }

    @And("I add 3")
    public void addThree()   {
        number += 3;
    }

    @Then("I verify the number to be 8")
    public void assertNumber()  {
        Assert.assertEquals(number, 8);
    }
}
