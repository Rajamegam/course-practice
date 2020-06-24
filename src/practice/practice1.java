package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@value='radio1']")).click();
		//System.out.println(driver.findElements(By.tagName("input")).size());
		//WebElement test1=driver.findElement(By.xpath("//header/div[2]/fieldset"));
		//System.out.println(test1.findElements(By.tagName("input")).size());
		WebElement minidriver = driver.findElement(By.xpath("//div[@class='block large-row-spacer']/div[1]"));
		System.out.println(minidriver.findElements(By.tagName("input")).size());
		for(int i=0;i<minidriver.findElements(By.tagName("input")).size();i++)
		{
			minidriver.findElements(By.tagName("input")).size();	
					}

	}

}
