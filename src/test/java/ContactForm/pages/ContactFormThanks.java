package ContactForm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactFormThanks {
	private String url = "http://www.mycontactform.com/samples/thanks.php";
	WebDriver driver;
	
	public ContactFormThanks(WebDriver driver){
		this.driver = driver;
		this.driver.get(url);
	}
	
	public WebElement getMessage(){
		return driver.findElement(By.xpath("//*[@id='center_col']/h4"));
	}
}
