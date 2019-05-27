package common;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PropertyUtils;

public class BaseFunction {
	
	public static WebDriver driver;
	public static WebElement element;
	private String path = System.getProperty("user.dir");
	private String chromeDriverPath = path+"/src/test/resources/driver/chromedriver";
	private String chromeDriver = "webdriver.chrome.driver";
	private String configFileName = "/src/test/resources/properties/config.properties";
	PropertyUtils property = new PropertyUtils();

	public void initializeChromeDriver() {
		System.setProperty(chromeDriver,chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void openPage(String nameOftheURL) throws IOException{
		String url = property.getProperty(configFileName,nameOftheURL);
		System.out.println("url : " + url);
		driver.get(url);
	}
	
	public void closeDriver() {
		driver.close();
	}
	
}
