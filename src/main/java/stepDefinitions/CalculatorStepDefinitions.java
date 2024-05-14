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
        Main.frontEnd.fiveButton.doClick();
    }

    @And("I press two")
    public void pressTwoButton() throws InterruptedException {
        Main.frontEnd.twoButton.doClick();
    }

    @And("I press eight")
    public void pressEightButton() throws InterruptedException {
        Main.frontEnd.eightButton.doClick();
    }

    @And("I press plus")
    public void pressPlusButton() throws InterruptedException {
        Main.frontEnd.plusButton.doClick();
    }

    @And("I press three")
    public void pressThreeButton() throws InterruptedException {
        Main.frontEnd.threeButton.doClick();
    }

    @And("I press equals")
    public void pressEqualsButton() throws InterruptedException {
        Main.frontEnd.sumButton.doClick();
    }

    @Then("the output should display {int}")
    public void verifyOutput(int expectedValue) throws InterruptedException {
        Assert.assertEquals(Integer.parseInt(Main.frontEnd.sumField.getText()), expectedValue);
    }

    @And("I press one")
    public void iPressOne() {
        Main.frontEnd.oneButton.doClick();
    }

    @And("I press zero")
    public void iPressZero() {
        Main.frontEnd.zeroButton.doClick();
    }

    @And("I press divide")
    public void iPressDivide() {
        Main.frontEnd.divideButton.doClick();
    }
}
