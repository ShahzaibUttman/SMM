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
	public void user_clicks_on_select_club_button_and_user_selects_a_club() throws InterruptedException {

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

	@When("there is logo sign in text select button")
	public void there_is_logo_sign_in_text_select_button() {
		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/h2"));
		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/div/div/div"));
		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[1]/div[1]/a/img"));
	}

	@Then("UI testing done")
	public void ui_testing_done() {
		System.out.println("UI Complete Login Page");
	}

	@When("user clicks on select club button")
	public void user_clicks_on_select_club_button() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/div/div/div")).click();
		Thread.sleep(2000);
	}

	@And("there is a search bar")
	public void there_is_a_search_bar() {
		driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]"));
	}

	@And("user searches for Solis")
	public void user_searches_for_solis() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("Solis");
		Thread.sleep(2000);
	}

	@Then("solis is displayed and search bar is working properly")
	public void solis_is_displayed_and_search_bar_is_working_properly() {
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/perfect-scrollbar/div/div[1]/div/div/div/ul/li"));
	}

	@When("user enters invalid email and short password")
	public void user_enters_invalid_email_and_short_password() {
		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/form/div[3]/input")).sendKeys("admimail.com");
		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/form/div[4]/input")).sendKeys("qwerp");
	}

	@Then("pop up is displayed")
	public void pop_up_is_displayed() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/form/div[4]/div[2]/div"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/form/div[3]/div/div"));
		Thread.sleep(2000);
	}

	@Given("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		String CurrentUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://smm-staging.dividisapp.com/pages/dashboard";
		if(CurrentUrl.equalsIgnoreCase(ExpectedUrl)) {
			System.out.println("User is on home page");
		}
		else
		{
			System.out.println("User is not on log in page");
		}
		Thread.sleep(2000);
	}

	@When("user clicks on create content")
	public void user_clicks_on_create_content() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(@title,'Create')]")).click();
		Thread.sleep(3000);

	}

	@Then("user is redirected")
	public void user_is_redirected() throws InterruptedException {
		String CreateContent = driver.getCurrentUrl();
		String expectedContent = "https://smm-staging.dividisapp.com/pages/publish-all";
		if(CreateContent.equalsIgnoreCase(expectedContent)) {
			System.out.println("User is on create content page");
		}
		else
		{
			System.out.println("User is not on log in page");
		}

	}

	@Then("there are three club boxes")
	public void there_are_three_club_boxes() {
		driver.findElement(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-publish/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/th[1]"));
		driver.findElement(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-publish/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/th[2]/span"));
		driver.findElement(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-publish/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/th[3]/span"));
		driver.findElement(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-publish/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/th[4]/span"));
		driver.findElement(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-publish/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/th[5]/span"));
	}

	@When("user search for solis")
	public void user_search_for_solis() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-publish/div/div[1]/div/div[2]/div/div[1]/div/div/input")).sendKeys("Solis");
		Thread.sleep(2000);
	}

	@Then("Solis appears in the search")
	public void solis_appears_in_the_search() {
		driver.findElement(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-publish/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td/div/label/div[2]/a"));
	}

	@And("user selects instagram only")
	public void user_selects_instagram_only() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-publish/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[216]/td/div/label/span")).click();
		Thread.sleep(2000);
	}
	
	@And("posts image")
	public void posts_image() throws InterruptedException {
		driver.findElement(By.xpath("//*[contains(@name, 'myfile')]")).sendKeys("C:/Users/Hajra/git/repository/SMM-Automated/src/test/resources/Images/download.jpg");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-publish/div/div[2]/div/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div/div/form[2]/div[3]/div[2]/div[4]/button")).click();
	}
	
	@Then("image is only posted to instagram")
	public void only_insta_post() throws InterruptedException {
		System.out.println("Passed");
	}


}
