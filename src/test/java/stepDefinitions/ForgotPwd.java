package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import testRunner.Driver;

public class ForgotPwd extends Driver {
    @When("I access Forgot Password page")
    public void i_access_forgot_password_page() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(20) > a")).click();
    }
    @When("I can reset my pwd")
    public void i_can_reset_my_pwd() throws InterruptedException {
        driver.findElement(By.cssSelector("#email")).sendKeys("test@test.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#form_submit")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
    }


}
