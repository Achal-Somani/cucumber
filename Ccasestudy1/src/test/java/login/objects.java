package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objects {
	public objects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="SignIn")
	public static WebElement signinbtn;
	
	@FindBy(xpath="//*[@id=\"userName\"]")
	public static WebElement usernamelogin;
	@FindBy(xpath="//*[@id=\"password\"]")
	public static WebElement passwordlogin;
	@FindBy(xpath="/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")
	public static WebElement loginbtn;
}
