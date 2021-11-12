package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testRunner.Driver;

public class Context extends Driver {
    @When("I select Context Menu")
    public void i_select_context_menu() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(7) > a")).click();
    }

    @When("I right click on image")
    public void i_right_click_on_image() throws InterruptedException {
        WebElement source = driver.findElement(By.cssSelector("#hot-spot"));
        Actions action = new Actions(driver).contextClick();
        action.contextClick(source).perform();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

    }

    @When("I click on image")
    public void i_click_on_image() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("#hot-spot")).click();
    }

    @Then("I go back")
    public void i_go_back() {
        driver.navigate().back();
        driver.quit();
    }
}
