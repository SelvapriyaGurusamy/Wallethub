package wallet.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	
    public static void loadDriver() {
   	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
   	 driver =  new ChromeDriver();
	
}
    
	public static String loadUrl() throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\WalletHub1\\src\\test\\resources\\Data.property");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		String fburl = prop.getProperty("fburl");
		driver.get(fburl);
		return fburl;
		
	}	
	public static String loadWalletUrl() throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\WalletHub1\\src\\test\\resources\\Data.property");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		String	walleturl = prop.getProperty("walleturl");
		return walleturl;
	}
	
	public void type(WebElement element, String data) {
		element.sendKeys(data);
		
		
	}
	
	public void click(WebElement element) {
		element.click();
		
	}
	
	public void clear(WebElement element) {
		element.clear();
	}
	
	
	public void select(WebElement element , int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public void select(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public void screenshot(File Destination) throws IOException {
		TakesScreenshot take = (TakesScreenshot)driver;
		File source =  take.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, Destination);
	}

	public void mouseHover(WebElement hoverbutton) {
		Actions action = new Actions(driver);
		action.moveToElement(hoverbutton).perform();
		
	}
	public void mouseHoverclick(WebElement hoverbutton) {
		Actions action = new Actions(driver);
		action.moveToElement(hoverbutton).click().perform();
	}
	
	public String getAttribute(WebElement element) {
		return element.getAttribute("value");
	
	}
	
	public void wait(int time ) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public  String emailid() throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\WalletHub1\\src\\test\\resources\\Data.property");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		return  prop.getProperty("email");
	
		
	}
	public String passWord() throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\WalletHub1\\src\\test\\resources\\Data.property");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty("password");
		
	}
	public String text() throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\WalletHub1\\src\\test\\resources\\Data.property");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty("text");
	
}
	
	public String getUsername() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username here:   ");
		String username = scan.next();
		return username;
		
	}
	
	public String getPassword() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password here:   ");
		String password = scan.next();
		return password;
}
}
