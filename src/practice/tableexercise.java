package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElementById("product");
		int rowcount=table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		System.out.println(rowcount);
		int columncount=table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		System.out.println(columncount);
		for(int i=0;i<rowcount;i++)
		{
			System.out.println(driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).get(2).getText());
			break;
		}
		
		

	}

}
