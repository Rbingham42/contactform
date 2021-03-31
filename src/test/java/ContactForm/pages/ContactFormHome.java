package ContactForm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactFormHome {
	private String url = "https://www.mycontactform.com/samples/basiccontact.php";
	private WebDriver driver;
	
	public ContactFormHome(WebDriver driver){
		this.driver = driver;
		this.driver.get(url);
	}
	
	public WebElement getNameTextBox(){
		return driver.findElement(By.name("q[1]"));
	}

	public WebElement getEmailTextBox(){
		return driver.findElement(By.name("email"));
	}
	
	public WebElement getMessageTextbox(){
		return driver.findElement(By.name("q[2]"));
	}
	
	public WebElement getSubmitButton(){
		return driver.findElement(By.name("submit"));
	}
}
