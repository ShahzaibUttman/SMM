package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class LoginSteps {


	static WebDriver driver = null;

	@Before 
	public void BrowserSetup() {



		System.out.println("I'm inside Browser Setup");
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Hajra/git/repository/SMM-Automated/src/test/resources/Drivers/chromedriver.exe"); 
		driver = new ChromeDriver();

		driver.navigate().to("https://smm-staging.dividisapp.com/");

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();


	}


	@After 
	public void teardown() { 
		System.out.println("Browser is closed.");

		driver.close(); 
		driver.quit(); 
	}

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {

		String expectedTitle = driver.getTitle();
		if(expectedTitle.equalsIgnoreCase("Dividis Social Media Manager")) {
			System.out.println("Passed");
		}
		else {			
			System.out.println("Not on Login Page");
			driver.close(); 
			driver.quit(); 
		}

		Thread.sleep(5000);
	}

	@And("user clicks on select club button and user select the club")
	public void user_clicks_on_select_club_button() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/div/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/perfect-scrollbar/div/div[1]/div/div[7]/div/img")).click();
		Thread.sleep(2000);
	}

	@When("user enters email and password")
	public void user_enters_email_and_password() {
		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/form/div[3]/input")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/form/div[4]/input")).sendKeys("qwertyuiop");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.id("kt_login_signin_submit")).click();
		Thread.sleep(2000);
	}

	@Then("user is logged in")
	public void user_is_logged_in() {
		driver.findElement(By.xpath("//*[@id=\"kt_quick_panel_toggle\"]"));

	}

	@When("user enters wrong email and password")
	public void user_enters_wrong_email_and_password() {
		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/form/div[3]/input")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/form/div[4]/input")).sendKeys("qwtyuiop");
	}

	@Then("user stays on Login Page")
	public void user_stays_on_login_page() {
		driver.findElement(By.xpath("//*[@id=\"kt_login_signin_submit\"]"));
	}

	@And("user clicks on select club button and user select ir-relevant the club")
	public void user_selects_irrelevant_club() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/div/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/perfect-scrollbar/div/div[1]/div/div[4]/div/img")).click();
		Thread.sleep(2000);

	}


}
