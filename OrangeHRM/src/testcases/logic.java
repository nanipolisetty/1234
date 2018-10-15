package testcases;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class logic {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\NAVEEN\\Setup files\\chromedriver.exe");	
	ChromeDriver driver =new ChromeDriver();
	WebDriverWait durga=new WebDriverWait(driver,30);
	driver.get("http://apps.qaplanet.in/qahrm/login.php");
	WebElement UN=driver.findElementByName("txtUserName");
	 WebElement PWD=driver.findElementByName("txtPassword");
	 WebElement Login =driver.findElementByName("Submit");
	 UN.sendKeys("qaplanet1");
	 PWD.sendKeys("lab1");
	 Login.click(); 
	 WebElement E= driver.findElementByXPath("//a[@href='./index.php?menu_no_top=eim']/span[@class='drop']");
	 WebElement F=driver.findElementByXPath("//a[@onclick]/span[contains(text(),'Company Info')]");
	 WebElement G=driver.findElementByXPath("//a[@onclick='menuclicked(this);']/span[contains(text(),'Locations')]");
	 Actions A =new Actions(driver);
	 A.moveToElement(E).perform();
A.moveToElement(F).perform();
A.moveToElement(G).click().perform();
driver.switchTo().frame("rightMenu");

do{
	List<WebElement> names=driver.findElementsByXPath("//table/tbody/tr/td[3]/a");	
	
for (WebElement z:names)

{	
	
if(z.getText().equals("S.M Solutions 2018-10-11 13:27:19.43")){
	System.out.println("harshini found");
	}

}
	
if(driver.findElementByXPath("//a[contains(text(),'Next')]").isEnabled()){
	driver.findElementByXPath("//a[contains(text(),'Next')]").click();
			Thread.sleep(3000);}
		else{
				System.out.println("checked all pages but no location record not found");
	}
	
} while(driver.findElementByXPath("//a[contains(text(),'Next')]").isDisplayed());

}
}
