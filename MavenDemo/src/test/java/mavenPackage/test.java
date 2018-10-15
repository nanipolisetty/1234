package mavenPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\NAVEEN\\Setup files\\chromedriver.exe");

	ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://apps.qaplanet.in/qahrm/login.php");
}
}
