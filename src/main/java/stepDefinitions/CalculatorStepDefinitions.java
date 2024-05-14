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
    public void pressFiveButton() {
        Main.frontEnd.fiveButton.doClick();
    }

    @And("I press two")
    public void pressTwoButton() {
        Main.frontEnd.twoButton.doClick();
    }

    @And("I press eight")
    public void pressEightButton() {
        Main.frontEnd.eightButton.doClick();
    }

    @And("I press plus")
    public void pressPlusButton() {
        Main.frontEnd.plusButton.doClick();
    }

    @And("I press three")
    public void pressThreeButton() {
        Main.frontEnd.threeButton.doClick();
    }

    @And("I press equals")
    public void pressEqualsButton() {
        Main.frontEnd.sumButton.doClick();
    }

    @Then("the output should display {int}")
    public void verifyOutput(int expectedValue) {
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
