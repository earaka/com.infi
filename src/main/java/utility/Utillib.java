package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.maven.base.testbase;

public class Utillib extends testbase
{

	static Alert alt;
	
	static Select sel;
	
	public static void max_window()
	{
		driver.manage().window().maximize();
	}
	
	public static void implicit_wait(int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public static void alert_Okbutton()
	{
		alt=driver.switchTo().alert();
		
		alt.accept();
	}
	
	public static void alert_Canclebutton()
	{
		alt=driver.switchTo().alert();
		
		alt.dismiss();
	}
	
	public static String alert_getText()
	{
		alt=driver.switchTo().alert();
		
		return alt.getText();
	}
	
	public static void alert_Sendkeys(String text)
	{
		alt=driver.switchTo().alert();
		
		alt.sendKeys(text);
	}
	
	public static void dd_selectByvisibleText(WebElement ele, String value)
	{
		sel=new Select(ele);
		
		sel.selectByVisibleText(value);
	}
	
	public static void switchtoFrameByname(String frameName)
	{
		driver.switchTo().frame(frameName);
	}
}
