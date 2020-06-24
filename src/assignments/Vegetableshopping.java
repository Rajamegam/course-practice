import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vegetableshopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\New folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		int j=0;
		//creating the array with the vegetables we needed to add in cart
		String[] vegies= {"Brocolli","Carrot","Pista"};
		int veggielength= vegies.length;
		//listing the product name
		List<WebElement> products=driver.findElementsByCssSelector("h4.product-name");
		//iterating through each profduct and checking whether the desired name is present in the list or not
		for(int i=0;i<products.size();i++)
		{
			//get the text from the list and splitting the text based on the seperator
			String[] name=products.get(i).getText().split("-");
			//after the seperation to reduce the unwanted space use trim
			String formattedname= name[0].trim();
			//conveting the array to array list.
			List vegieslist= Arrays.asList(vegies);
			if(vegieslist.contains(formattedname))
			{
				driver.findElementsByXPath("//div[@class='product-action']//button").get(i).click();
				if(j==veggielength)
				{
					j++;
					break;
				}
					
			} 
			
		}
}

}
