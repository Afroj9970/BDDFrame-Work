package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testcases {
	WebDriver driver;

	@Given("^open chromebrowser with facebook$")
	public void open_chromebrowser_with_facebook() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver and jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_valid_and(String username, String password) throws Throwable {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^user able to login$")
	public void user_able_to_login() throws Throwable {

	}

	@Then("^user back on laogin page$")
	public void user_back_on_laogin_page() throws Throwable {
		driver.quit();
	}
}
