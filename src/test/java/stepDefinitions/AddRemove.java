package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testRunner.Driver;


public class AddRemove extends Driver {



    @When("I select AddRemove")
    public void iSelectAddRemove() {


        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(2) > a")).click();
    }

    @And("I select add element")
    public void iSelectAddElement() {
        driver.findElement(By.cssSelector("#content > div > button")).click();
    }

    @And("I select delete")
    public void iSelectDelete() {
        driver.findElement(By.cssSelector("#elements > button")).click();
    }

    @Then("i close window")
    public void iCloseWindow() {
        driver.quit();

    }
}
