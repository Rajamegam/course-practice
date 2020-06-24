package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestivedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElementById("autocomplete").sendKeys("IND");
		driver.findElementById("autocomplete").sendKeys(Keys.DOWN);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		String script= "return document.getElementById(\"autocomplete\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("India"))
		{
			i++;
			driver.findElementById("autocomplete").sendKeys(Keys.DOWN);
			//driver.findElementById("autocomplete").sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
	
		}
		/*(i>10)
		{
			System.out.println("execution success");
		}*/
		
		
		
		
		


	}

}
