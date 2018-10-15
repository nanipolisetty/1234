package testcases;
import org.openqa.selenium.chrome.ChromeDriver;
public class CommonStepsInTestCases {
	String uid="qaplanet1";
	String pwd="lab1";
	String url="http://apps.qaplanet.in/qahrm/login.php";
	
void launchbrowser(){
System.setProperty("webdriver.chrome.driver", "D:\\NAVEEN\\Setup files\\chromedriver.exe");	
ChromeDriver driver =new ChromeDriver();
}

void openingUrl(){
	driver.get(credens.url);
}





}
