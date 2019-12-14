package selenium_Path_Identification;



import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Wait;



public class Test_Case_Execution {
	
	Globals gb = new Globals();
	
	WebDriver driver=new ChromeDriver();
	
	//These are objects of this page
	By User_Name = By.xpath("//input[@id='input_5_1']");
	By Mail_id = By.xpath("//input[@id='input_5_2']");
	By Mobile_No = By.xpath("//input[@id='input_5_3']");
	By Training_mode = By.id("input_5_5");
	By Submit_Button = By.id("gform_submit_button_5");
	By Top_Error = By.xpath("//div[@id='gform_5']/div[2]");
	
	
	

	@Test
	public void main() throws InterruptedException {
		App_Navigate();
	//	obj.AlertScript();
		Enroll_Training();
	//	Menu_Radio_CheckBox();
	//	obj.Drag_Drop();
	//	obj.Radio_button();
	//	obj.Tables();
	//	obj.Popup();
	//	obj.Tab_Navigation();
		
		
	}
	
	public void App_Navigate() throws InterruptedException{
	
		//edit, drop down, mouse hover, tables
		driver.navigate().to("https://nareshit.in/course-schedule/");
		
		//for drag and drop
		//driver.navigate().to("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		//driver.navigate().to("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		//driver.navigate().to("https://enterprise.verizon.com/resources/reports/dbir/");
		//Thread.sleep(10000);
		
		//Explict wait
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@id='page-title']")));  
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void Enroll_Training() throws InterruptedException{
	try{	
		driver.findElement(User_Name).sendKeys(Globals.SheetMap.get("User_Name"));
		driver.findElement(Mail_id).sendKeys(Globals.SheetMap.get("Mail_id"));
		driver.findElement(Mobile_No).sendKeys(Globals.SheetMap.get("Mobile_No"));
		Thread.sleep(3000);
		driver.close();
		
		//driver.findElement(user_name).sendKeys("Test1234");
		//driver.findElement(By.xpath("Mail_Id")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("Mobile_No")).sendKeys("9876543210");
		
/*		WebElement element = driver.findElement(Training_mode);
		Select dropdown_Value = new Select(element);
		dropdown_Value.selectByVisibleText(Globals.SheetMap.get("Training_mode"));
		Thread.sleep(4000);
		/*driver.findElement(Submit_Button).click();
		Thread.sleep(6000);
		boolean ErrorOne = driver.findElement(Top_Error).isDisplayed();
		if(ErrorOne==true){
			String ErrorText = driver.findElement(Top_Error).getText(); 
			System.out.println("Error at the header is displayed and its value is: "+ErrorText );
		}else{
			System.out.println("Verification failed for first error message.");
		}*/
	//	Error_At_Field_Level();
	}catch(Exception E){
		throw E;
	}
	}
	
	
	private void Screen_shot() throws Exception {
		try{
			TakesScreenshot TSS = ((TakesScreenshot)driver);
			File ScreenshotSrcFile = TSS.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ScreenshotSrcFile, new File(""));
		}catch(Exception E){
			throw E;
		}
	}

	
	private void AlertScript() {
		WebElement element = driver.findElement(By.xpath("//div[@id='snp-bld-step-1']/form/div/img"));
		driver.switchTo().activeElement().isDisplayed();
	}

	public void Tab_Navigation() throws InterruptedException{
		String Current_Window = driver.getWindowHandle();
		driver.findElement(By.xpath("//table[@id='tablepress-37']/tbody/tr[1]/td[1]/b/a")).click();
		Thread.sleep(10000);
		ArrayList<String> tabs1 = new ArrayList<String>();
		tabs1.addAll(driver.getWindowHandles());
		Thread.sleep(3000);
		System.out.println(tabs1.size());
		driver.switchTo().window(tabs1.get(1));
		Thread.sleep(5000);
		String value = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[2]/main/article/header/h1")).getText();
		System.out.println(value);
		driver.close();
		driver.switchTo().window(Current_Window);
		Thread.sleep(2000);
		driver.quit();
	}
	
	public void Popup() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='main']/div[2]/div[2]/article/div/ul/li[1]/label/a/img")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Test1");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Test2");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys("9876543210");
		
		WebElement Job_Level = driver.findElement(By.xpath("//select[@id='Job_Level__c']"));
		WebElement Country = driver.findElement(By.xpath("//select[@id='Country']"));
		Select value1 = new Select(Job_Level);
		value1.selectByVisibleText("Manager-Level");
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("abc pvt ltd");
		Select value2 = new Select(Country);
		value2.selectByIndex(20);
		driver.findElement(By.xpath("//label[text()='*I confirm I have read and understood']")).click();
		Thread.sleep(2000);
		
	}

	private void Tables() {
		LinkedList<String> LL1 = new LinkedList<String>();
		LinkedList<String> LL2 = new LinkedList<String>();
		LinkedHashSet<String> LHS = new LinkedHashSet<String>();
		
		List<WebElement> element = driver.findElements(By.xpath("//table[@id='tablepress-37']/tbody/tr/td[1]"));
		int Table_Size = element.size();
		System.out.println(Table_Size);
		
		for(int i=0;i<Table_Size;i++){
			System.out.println(element.get(i).getText());
			LL1.add(element.get(i).getText());
			LL2.add(element.get(i).getText());
			LHS.add(element.get(i).getText());
		}
		
		Collections.sort(LL1);
		System.out.println("=============================================================================");
		System.out.println(LL1);
		System.out.println("=============================================================================");
		if(LL1.equals(LL2)){
			System.out.println("Strings are sorted in ascending order");
		}else{
			System.out.println("Strings are not sorted in order");
		}
		
		int unique = LHS.size();
		int non_unique = LL1.size();
		if(unique==non_unique){
			System.out.println("Unique values");
		}else{
			System.out.println("Not unique");
		}
	}

	public void Radio_button() throws InterruptedException{
		
		String value = driver.findElement(By.xpath("//./label[text()='Option 3']")).getText();
		System.out.println(value);
		//driver.findElement(By.xpath("//input[@id='u_0_6']")).click();
		Thread.sleep(3000);
	}
	

	
	public void Menu_Radio_CheckBox() throws InterruptedException{
		List<WebElement> Elements = driver.findElements(By.xpath("//div[@id='easycont']/div/div[2]/div[2]/div[2]/div/label"));
		int size = Elements.size();
		System.out.println(size);
		//System.out.println(Elements.get(0));
		for(int i=0;i<size;i++){
			if(i==1 || i==3){
				Elements.get(i).click();
			}else{
				continue;
			}
		}
		
		
		
	/*	Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("menu-item-550")));
		actions.perform();
		driver.findElement(By.id("menu-item-549")).click(); */
		//driver.getWindowHandle().
		
	//	driver.switchTo().window();
	}
	
	public void Drag_Drop() throws InterruptedException{
		Actions actions = new Actions(driver);
		WebElement Element1 = driver.findElement(By.xpath("//div[@id='block-3']/h1"));
		WebElement Element2 = driver.findElement(By.xpath("//div[@id='block-2']/h1"));
		
		actions.dragAndDrop(Element1, Element2);
		actions.perform();
		Thread.sleep(3000);
		System.out.println("Done");
	}
	
	public void Error_At_Field_Level(){
		boolean ErroTwo = driver.findElement(By.id("")).isDisplayed();
		if(ErroTwo==true){
			String Value = driver.findElement(By.id("field_5_12")).getText();
			System.out.println("The error exists and error is: "+Value);
		}else{
			System.out.println("Error was not seen and test case is failed.");
		}

	}
}
