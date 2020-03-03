package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import signuptestme.pageObjects;

public class login {
	WebDriver driver;
	
	@Given("^Login details$")
	public void Login_details() throws Throwable
	{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\A06438DIRNP2C.05.15\\Desktop\\drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("http://localhost:8083/TestMeApp2.2/");
			
	}
	@When("enter {string} and {string}")                            
    public void enter_and(String username, String password) throws Throwable {      
	  new objects(driver);                                   
	  objects.signinbtn.click();
	  objects.usernamelogin.sendKeys(username);
	  objects.passwordlogin.sendKeys(password);
      objects.loginbtn.click();
    }
      @Then("logged in successfully")
      public void logged_in_successfully() throws Throwable {
    	  System.out.println("logged in");
      }
}
