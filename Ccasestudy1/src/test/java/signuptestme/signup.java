package signuptestme;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class signup {
	WebDriver driver;
	
	@Given("Navigate to home page")
	public void navigate_to_home_page() throws Throwable {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\A06438DIRNP2C.05.15\\Desktop\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost:8083/TestMeApp2.2/");
		
  }

	@When("user enters valid inputs {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enters_valid_inputs(String username,String firstname,String lastname, String pwd, String pwdconfirm, String email,String mob,String dob,String addr, String security,String answer) throws Throwable {
	  new pageObjects(driver);
	  pageObjects.signupclick.click();
	  pageObjects.username.sendKeys(username);
	  pageObjects.first.sendKeys(firstname);
	  pageObjects.last.sendKeys(lastname);
	  pageObjects.pwd.sendKeys(pwd);
	  pageObjects.pwdconfirm.sendKeys(pwdconfirm);
	  pageObjects.gender.click();
	  pageObjects.email.sendKeys(email);
	  pageObjects.mob.sendKeys(mob);
	  pageObjects.dob.sendKeys(dob);
	  pageObjects.addr.sendKeys(addr);
	  Select question=new Select(pageObjects.sec);
	  question.selectByVisibleText(security);
	  pageObjects.ans.sendKeys(answer);
	  pageObjects.reg.click();
  }

  @Then("^user registered successfully$")
  public void user_registered_successfully() throws Throwable {
	  System.out.println("registered success..");
  }
                                
                                                             
}