import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class udemyassignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String URL = "https://www.cleartrip.com/";
		String airlinename = "Jetairways";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElementByCssSelector(".icon.ir.datePicker").click();
		driver.findElementByCssSelector(".ui-state-default.ui-state-highlight.ui-state-active").click();
		Select adult = new Select(driver.findElementById("Adults"));
		adult.selectByValue("2");
		Select children = new Select(driver.findElementById("Childrens"));
		children.selectByIndex(7);
		driver.findElementByXPath("//a[@id='MoreOptionsLink']").click();
		driver.findElementById("AirlineAutocomplete").sendKeys(airlinename);
		driver.findElementByCssSelector(".booking.large").click();
		System.out.println(driver.findElementById("homeErrorMessage").getText());

	}

}
