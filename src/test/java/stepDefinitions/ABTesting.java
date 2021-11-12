package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import testRunner.Driver;


public class ABTesting extends Driver {


    @Given("I open browser")
    public void i_open_browser() {
        System.setProperty("webdriver.chrome.driver", "D:\\IT\\SDA\\Programe\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();


    }

    @When("i click on the AB Testing link")
    public void i_click_on_the_ab_testing_link() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a")).click();


    }

    @When("a new page is open")
    public void a_new_page_is_open() {
        String status = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText();
        System.out.println(status);


    }

    @Then("i quit page")
    public void i_quit_page() {

        driver.quit();


    }

}
