package signuptestme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;


public class pageObjects {
	WebDriver driver;
	public pageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")
	public static WebElement signupclick;
	@FindBy(xpath="//*[@id=\"userName\"]")
	public static WebElement username;
	@FindBy(xpath="//*[@id=\"firstName\"]")
	public static WebElement first;
	@FindBy(xpath="//*[@id=\"lastName\"]")
	public static WebElement last;
	@FindBy(xpath="//*[@id=\"password\"]")
	public static WebElement pwd;
	@FindBy(xpath="//*[@id=\"pass_confirmation\"]")
	public static WebElement pwdconfirm;
	@FindBy(css="input[id='gender'][value='Female']")
	public static WebElement gender;
	@FindBy(xpath="//*[@id=\"emailAddress\"]")
	public static WebElement email;
	@FindBy(xpath="//*[@id=\"mobileNumber\"]")
	public static WebElement mob;
	@FindBy(xpath="//*[@id=\"dob\"]")
	public static WebElement dob;
	@FindBy(xpath="//*[@id=\"address\"]")
	public static WebElement addr;
	@FindBy(name="securityQuestion")
	public static WebElement sec;
	@FindBy(xpath="//*[@id=\"answer\"]")
	public static WebElement ans;
	@FindBy(xpath="/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")
	public static WebElement reg;

//	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
//	  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Ankita123");
//	  driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Ankita");
//	  driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Chourasia");
//	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
//	  driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys("123456");
//	 // driver.findElement(By.id("gender")).click();
//	 driver.findElement(By.cssSelector("input[id='gender'][value='Female']")).click();
//	 //gender.click();
//	 // By byCss=By.cssSelector("[name='Female'][type='radio']");
//	 // driver.findElement(byCss).click();
//	  driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("ankitac123@gmail.com");
//	  driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("9865472315");
//	  driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("10/25/2000");
//	  driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("35,Pearl Society,Nagpur");
//	  Select question=new Select(driver.findElement(By.name("securityQuestion")));
//	  question.selectByVisibleText("What is your Birth Place?");
//	  driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys("Nagpur");
//	  driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
//	 
//	  }

	



}
