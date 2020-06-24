import org.openqa.selenium.chrome.ChromeDriver;

public class udemyassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String URL="https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElementById("checkBoxOption1").click();
		System.out.println(driver.findElementById("checkBoxOption1").isSelected());
		Thread.sleep(2000);
		driver.findElementById("checkBoxOption1").click();
		System.out.println(driver.findElementById("checkBoxOption1").isSelected());
		System.out.println(driver.findElementsByXPath("//input[@type='checkbox']").size());
	}

}
