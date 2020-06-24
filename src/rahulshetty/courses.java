package rahulshetty;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.interactions.Actions;

public class courses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/#/index");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Courses")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		;
		// Actions act=new Actions(driver);

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> iT = ids.iterator();
		// String coursecount = null;
		while (iT.hasNext()) {
			driver.switchTo().window(iT.next());

			List<WebElement> coursecounts = driver.findElements(By.className("course-listing"));
			int count = coursecounts.size();
			for (int i = 0; i < count; i++) {
				String coursecount = driver.findElements(By.className("course-listing-title")).get(i).getText();
				if (coursecount.equals("Selenium Webdriver with Java (Basics+Advanced+Interview Guide)")) {
					driver.findElement(By.className("course-listing")).click();
				}
			}
		}

	}
}
