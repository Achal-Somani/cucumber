package casestudy4;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/searchingrunner.feature",glue= {"casestudy4"})
public class testSearchingcartrunner {

}
