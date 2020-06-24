import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class udemyassignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement selected=driver.findElementById("checkBoxOption1");
		selected.click();
		String displaytext=driver.findElementById("checkBoxOption1").getAttribute("value");
		Select s= new Select(driver.findElementById("dropdown-class-example"));
		s.selectByValue(displaytext);
		driver.findElementById("name").sendKeys(displaytext);
		driver.findElementById("alertbtn").click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
	}
	

}
