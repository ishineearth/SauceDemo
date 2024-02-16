package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.WebPageObject;

public class WebStepDefinition {
	WebDriver driver = null;
	WebPageObject webPage;

//	@Given("^Open browser and enter (.*) url$")
//	public void openUrl(String url) throws IOException {
//		driver =  new ChromeDriver();
//		driver.manage().window().maximize();
//		webPage = new WebPageObject(driver);
//		String urlToEnter = webPage.getPropertyData("url");
//		System.out.println(urlToEnter);
//		driver.get(urlToEnter); 
//	}

	@When("^Click on username field and enter (.*) username$") 
	public void enterDataOnUserName(String username) throws IOException {
		webPage = new WebPageObject(driver);
		String usernameToEnter = webPage.getPropertyData("username");
		webPage.enterUserName(usernameToEnter);
	}

	@When("^Click on password field and enter (.*) password$") 
	public void enterDataOnPassword(String password) throws IOException { 
		webPage = new WebPageObject(driver);
		String passwordToEnter = webPage.getPropertyData("password");
		webPage.enterPassword(passwordToEnter); }

	@When("^Click on login button$") 
	public void clickLoginButton() {
		webPage = new WebPageObject(driver);
		webPage.clickOnLoginButton(); }

}

