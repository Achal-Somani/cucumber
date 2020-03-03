package signuptestme;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Features/signup.feature",
				glue= {"signuptestme"})

public class testSignuprunner {

}
