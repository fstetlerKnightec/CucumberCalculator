package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Main;
import org.junit.Assert;


public class CalculatorStepDefinitions {

    @Given("I open the calculator")
    public void placeHolder() {
        String [] args = {"arg1", "arg2"};
        Main.main(args);
    }

    @And("I press the clear button")
    public void pressClearButton() {
        Main.frontEnd.clearButton.doClick();
    }

    @And("I press multiply")
    public void pressMultiplyButton() {
        Main.frontEnd.timesButton.doClick();
    }

    @And("I press five")
    public void pressFiveButton() throws InterruptedException {
        Thread.sleep(3000);
        Main.frontEnd.fiveButton.doClick();
    }

    @And("I press two")
    public void pressTwoButton() throws InterruptedException {
        Thread.sleep(3000);
        Main.frontEnd.twoButton.doClick();
    }

    @And("I press eight")
    public void pressEightButton() throws InterruptedException {
        Thread.sleep(3000);
        Main.frontEnd.eightButton.doClick();
    }

    @And("I press plus")
    public void pressPlusButton() throws InterruptedException {
        Thread.sleep(3000);
        Main.frontEnd.plusButton.doClick();
    }

    @And("I press three")
    public void pressThreeButton() throws InterruptedException {
        Thread.sleep(3000);
        Main.frontEnd.threeButton.doClick();
    }

    @And("I press equals")
    public void pressEqualsButton() throws InterruptedException {
        Thread.sleep(3000);
        Main.frontEnd.sumButton.doClick();
    }

    @Then("the output should display {int}")
    public void verifyOutput(int expectedValue) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(Integer.parseInt(Main.frontEnd.sumField.getText()), expectedValue);
        Thread.sleep(3000);
    }
}
