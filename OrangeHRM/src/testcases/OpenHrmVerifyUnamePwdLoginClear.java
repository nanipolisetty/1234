package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class OpenHrmVerifyUnPwdLoginClear{
	//credentials
	String uid="qaplanet1";
	String pwd="lab1";
	String url="http://apps.qaplanet.in/qahrm/login.php";
void openingBrowser() throws InterruptedException{

	
	// opening chrome  browser
	System.setProperty("webdriver.chrome.driver", "D:\\NAVEEN\\Setup files\\chromedriver.exe");	
	ChromeDriver driver =new ChromeDriver();
	
	
	//creating object for the class to access credentials using reference
		
	VerifyOrangeHrm  credens=new VerifyOrangeHrm();
	void openingUrl(){
	//opening url
	driver.get(credens.url);}
	
	// getting title of the home page
	String har=driver.getTitle();
	//verifying title of home page
	if(har.equals("OrangeHRM - New Level of HR Management")){
		System.out.println("home page displayed with the HRM title");
	}
	 // getting web elements of the page
	WebElement UN=driver.findElementByName("txtUserName");
	 WebElement PWD=driver.findElementByName("txtPassword");
	 WebElement Login =driver.findElementByName("Submit");
	 WebElement clearbutton=driver.findElementByName("clear");
	//verify clear button 
 UN.sendKeys("checking clear button");
String clear1=UN.getAttribute("value");
System.out.println(clear1);

clearbutton.click();
String clear2=UN.getAttribute("value");
System.out.println(clear2);

	 //verifying User name field
	 if (UN.isDisplayed()&&UN.isEnabled())
	{
	System.out.println("Username field available");
	UN.clear();
	UN.sendKeys(credens.uid);

	}
	else
	System.out.println("username field not available");
	// verifying password field
	if (PWD.isDisplayed()&&PWD.isEnabled())
	{
	System.out.println("Password field available");
	PWD.clear();
	PWD.sendKeys(credens.pwd);
	}
	else
	System.out.println("password field not available");
	
	//verifying login button availability
	if (Login.isDisplayed()&&Login.isEnabled())
	{
	System.out.println("Login button available");
	
	Login.click();
	}
	else
	System.out.println("Login button not available");	
	Thread.sleep(2000);
	
	// verifying Welcome UN page
	
	if (driver.findElement(By.xpath("//div[@id='option-menu-bar']/ul/li[1]")).getText().equals("Welcome "+"qaplanet1"))
		
System.out.println("Orange HRM displayed with welcome message");		

else
	System.out.println("failed to display OrangeHRM home page");
if (driver.findElementByLinkText("Change Password").isEnabled())
	System.out.println("change password is available and enable");
	else
		System.out.println("change password not available");
	

	if (driver.findElementByLinkText("Logout").isEnabled())
		driver.findElementByLinkText("Logout").click();
	else{
		System.out.println("logout button not available");
	}

	String hrm =driver.getTitle();
	//verifying title of home page
	if(hrm.equals("OrangeHRM - New Level of HR Management")){
		System.out.println("logout successful and navigate to hrm home page");
	}
}	 
}
