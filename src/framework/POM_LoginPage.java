package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LoginPage 
{
	@FindBy(id="email")
	private WebElement usn;
	@FindBy(id="pass")
	private WebElement psw;
	@FindBy(name="login")
	private WebElement button;
	
	public POM_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsn()
	{
		usn.sendKeys("admin");
	}
	public void enterPsw()
	{
		psw.sendKeys("admin@123");
	}
	public void clickLogin()
	{
		button.click();
	}
}
