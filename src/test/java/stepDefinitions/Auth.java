package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import testRunner.Driver;


public class Auth extends Driver {
    @When("I click on Basic Auth")
    public void i_click_on_basic_auth() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(3) > a")).click();
    }

    @When("I input username and password i can login")
    public void i_input_username_and_password_i_can_login() {
        String username = "admin";
        String password = "admin";

        driver.get("https://" + username + ':' + password + '@' + "the-internet.herokuapp.com/basic_auth");
    }

    @Then("I go back on main page")
    public void i_go_back_on_main_page() {
        driver.navigate().back();
        driver.navigate().back();

    }

}
