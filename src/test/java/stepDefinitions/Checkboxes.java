package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testRunner.Driver;


public class Checkboxes extends Driver{
    @When("i access Checkboxes")
    public void i_access_checkboxes() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(6) > a")).click();
    }
    @When("i click on checkboxes")
    public void i_click_on_checkboxes() throws InterruptedException {
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")).click();
    }
    @Then("I close browser")
    public void i_close_browser() {
        driver.quit();
    }

}
