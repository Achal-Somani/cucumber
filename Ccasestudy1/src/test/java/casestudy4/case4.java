package casestudy4;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import searching.objects;
import signuptestme.pageObjects;
import cucumber.api.java.en.Then;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

public class case4 {
	WebDriver driver;
	 @Given("^Navigate to home page$")
	  public void NavigateToHomePage() throws Throwable {
	
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\A06438DIRNP2C.05.15\\Desktop\\drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	}
	  @When("user enters {string} and {string}")
	  public void user_enters_username_and_password(String username,String password) throws Throwable {
		  new objects(driver);
		  objects.signin.click();
		  objects.username.sendKeys(username);
		  objects.password.sendKeys(password);
		  objects.Login.click();
	  }
	  @Then("^user logged in successfully$")
	  public void user_logged_in_successfully() throws Throwable {
		  		System.out.println("User Login Successfully");
	  }

	  @When("larry searches below products in the search box {string}")
	  public void larry_searches_below_products_in_the_search_box(String product) throws Throwable
	  {
		  new objects(driver);
		  objects.search.sendKeys(product);
			  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
			  if(objects.cart.isDisplayed())
			  {
				  objects.cart.click();
			  }
			  else
			  {
				  throw new NoSuchElementException("can't find");
				  //objects.home.click();
			  }
			 
		  }
		  
	  @Then("^product should be added in cart$")
	  public void product_should_be_added_in_cart() throws Throwable {
		  		System.out.println("cart added Successfully");
	  }
}
