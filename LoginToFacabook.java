package learning.AB70Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToFacabook 
{
	@Test
	public void withvalidCred()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.EnterValidEmailId();
		loginpage.EnterValidPassword();
		loginpage.ClickOnLoginButton();
	}
	
}
