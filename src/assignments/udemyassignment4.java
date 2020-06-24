import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class udemyassignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String URL="http://the-internet.herokuapp.com/";
		driver.get(URL);
		Actions ac=new Actions(driver);
		driver.findElementByCssSelector("a[href*='nested']").click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElementById("content").getText());
		
	}

}
