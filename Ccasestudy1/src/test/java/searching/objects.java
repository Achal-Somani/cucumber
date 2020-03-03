package searching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class objects {
	public objects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a[contains(text(),'SignIn')]")
	public static WebElement signin;
	@FindBy(name="userName")
	public static WebElement username;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(name="Login")
	public static WebElement Login;
	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")
	public static WebElement reg;
	@FindBy(xpath="/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")
	public static WebElement cart;
	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a")
	public static WebElement home;
	//@FindBy(name="products")
	@FindBy(xpath="//*[@id=\"myInput\"]")
	public static WebElement search;

}
