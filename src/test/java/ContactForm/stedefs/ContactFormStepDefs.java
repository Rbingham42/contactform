package ContactForm.stedefs;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ContactForm.pages.ContactFormHome;
import ContactForm.pages.ContactFormThanks;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactFormStepDefs {
	private ContactFormHome contactHome;
	private ContactFormThanks contactThanks;
	private WebDriver driver;
	
	@Before
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Given("I am on the contactform web page")
	public void i_am_on_the_contactform_web_page() {
	    // Write code here that turns the phrase above into concrete actions
		contactHome = new ContactFormHome(driver);
	}

	@When("I enter a valid name , email address, enter a message and click submit")
	public void i_enter_a_valid_name_email_address_enter_a_message_and_click_submit(List<String> fields) throws InterruptedException {
	    contactHome.getNameTextBox().sendKeys(fields.get(0));
	    contactHome.getEmailTextBox().sendKeys(fields.get(1));
	    contactHome.getMessageTextbox().sendKeys("This is a message");
	    //Thread.sleep(5000);
	    contactHome.getSubmitButton().click();
	}

	@Then("I should be redirected to the Thank you page")
	public void i_should_be_redirected_to_the_Thank_you_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//Thread.sleep(5000);
		contactThanks = new ContactFormThanks(driver);
		WebElement msg = contactThanks.getMessage();
		
		Assert.assertEquals(msg.getText(), "Thank You");
	}
	
	@After
	public void aftertest(){
		driver.quit();
	}
}
