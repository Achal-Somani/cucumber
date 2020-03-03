package login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Features/login.feature",
				glue= {"login"})


public class testLogrunner {

}
