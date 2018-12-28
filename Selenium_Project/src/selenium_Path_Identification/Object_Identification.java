package selenium_Path_Identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Object_Identification {
		//WebDriver driver = new FirefoxDriver();
		
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new FirefoxDriver();
			
			driver.navigate().to("https://nareshit.in/classroom-training/");
			Thread.sleep(5000);
			String Value = driver.findElement(By.id("text-13")).getText();
			System.out.println(Value);
			System.out.println("========================================================");
			String Value1 = driver.findElement(By.xpath("//section[@id='text-13']/div/h4")).getText();
			System.out.println(Value1);
			System.out.println("=========================================================");
			String Value2 = driver.findElement(By.className("widget-wrap")).getText();
			System.out.println(Value2);
			System.out.println("==========================================================");
			//String value3 = driver.findElement(By.name("oauth2relay913797193")).getText();
			//System.out.println(value3);
			//System.out.println("==========================================================");
			String value4 = driver.findElement(By.linkText("HYDERABAD")).getText();
			System.out.println(value4);
			System.out.println("==========================================================");
			String value5 = driver.findElement(By.cssSelector(".widget-title.widgettitle")).getText();
			System.out.println(value5);
			System.out.println("=========================================================================");
			
			//Weekend Training
			
			Select Value123 = new Select(driver.findElement(By.xpath("//select[@id='input_5_5']")));
			
			Value123.selectByVisibleText("Weekend Training");
			
			
			
		}
		
}


























