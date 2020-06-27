package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		List<WebElement>amountlists=driver.findElements(By.cssSelector("tr td:nth-child(3)"));
		ArrayList<String> amountlist=new ArrayList<String>();
		for(int i=0;i<amountlists.size();i++)
		{
			amountlist.add(amountlists.get(i).getText());
		}
		for(String s1:amountlist)
		{
			System.out.println(s1);
		}
		Collections.sort(amountlist);
		System.out.println("---------------------------------------------");
		System.out.println(amountlist);
	}

}
