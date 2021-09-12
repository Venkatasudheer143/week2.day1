package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafHomePage {

	public static void main(String[] args) {

		String URL = "http://leaftaps.com/opentaps/control/main";
		String userName = "demosalesmanager";
		String pasword = "crmsfa";
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		// Maximise the browser
		driver.manage().window().maximize();

		// launch LeafAps application
		driver.get(URL);
		
		//UserName,password and Login 
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(pasword);
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//crmsfa Button
		System.out.println("CRMSFA page Title: "+driver.getTitle());
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Create Lead Page
		System.out.println("My Home page Title: "+driver.getTitle());
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Lead Page
		System.out.println("Create Lead Page Title: "+driver.getTitle());
		
		//company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Venkat");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Subbu");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Venkat Profile");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("528128");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Notes");
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("10361");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("venkat");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/12/21");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("400");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Ticker Symbol");
		
		
		
		//
		WebElement country_code = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		country_code.clear();
		country_code.sendKeys("4");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("528129");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("08626");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sudheerkumar.venkata@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8923712739");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Sham");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://testleaf.com/");
		
		
		//create lead button
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Submit button performed");
		
		System.out.println("Page Title: "+driver.getTitle());


	}

}
