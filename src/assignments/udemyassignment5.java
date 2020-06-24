import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class udemyassignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElementByLinkText("Multiple Windows").click();
		driver.findElementByLinkText("Click Here").click();
		Set<String> ID=driver.getWindowHandles();
		Iterator<String> newID=ID.iterator();
		String parentID=newID.next();
		String childID=newID.next();
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		

	}

}
