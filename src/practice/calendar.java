package practice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//div[@class='xp__dates-inner']").click();
		List<WebElement> datelist =driver.findElementsByClassName("bui-calendar__date");
		//System.out.println(datelist);
		int datecount=driver.findElementsByClassName("bui-calendar__date").size();
		for(int i=1;i<datecount;i++)
		{
			String date=driver.findElementsByClassName("bui-calendar__date").get(i).getText();
			if(date.equals("20"))
			{
				driver.findElementsByClassName("bui-calendar__date").get(i).click();
				break;
			}
		}
		
		
		

	}

}
