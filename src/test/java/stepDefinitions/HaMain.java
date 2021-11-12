package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import testRunner.Driver;


public class HaMain extends Driver {
    @Given("open HA main page")
    public void open_ha_main_page() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

    }

    @When("The logo is on the right")
    public void the_logo_is_on_the_right() {
        boolean object = driver.findElement(By.cssSelector("body > div:nth-child(2) > a > img")).isDisplayed();
        assert object;
        driver.quit();
    }


}
