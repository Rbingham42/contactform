package ContactForm;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/ContactForm",
        glue = "ContactForm"
)
public class ContactFormtestSuite {
}

