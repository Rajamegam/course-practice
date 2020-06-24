import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Udemyassignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String URL="http://www.itgeared.com/demo/1506-ajax-loading.html";
		driver.get(URL);
		driver.findElementByCssSelector("a[href*='loadAjax']").click();
		WebDriverWait assignment= new WebDriverWait(driver,25);
		assignment.until(ExpectedConditions.elementToBeClickable(By.id("results")));
		System.out.println(driver.findElementById("results").getText());
		
		
		
		
		
	}

}
