package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.PropertyUtils;


public class CommonFunction extends BaseFunction {
	
	PropertyUtils property = new PropertyUtils();
	BaseFunction base = new BaseFunction();
	private String path = System.getProperty("user.dir");

	private final String locatorsPropertyFile = "/src/test/resources/properties/locators/objects.properties";
	private final String webTextPropertyFile = "/src/test/resources/properties/webText/text.properties";
	private BufferedReader br;
	private final String keywordTextPropertyFile = path+"/src/test/resources/properties/data/data.txt";
	
	public void clickOnElement(String elementToClick) throws Throwable {
		element = findElementByID(elementToClick);
		element.click();
	}
	
	public void setElementText(String textToSet, String elementToSet) throws Throwable{
		element = findElementByID(elementToSet);
		element.sendKeys(property.getProperty(webTextPropertyFile,textToSet));
	}
	
	public List<WebElement> findListOfElementsByXpath(String elementPath) throws Throwable {
		waitForPageToLoadImplicitly();
		return driver.findElements(By.xpath(property.getProperty(locatorsPropertyFile, elementPath)));
	}
	
	public WebElement searchSelectedElementFromList(String textToSearch, String elementToSearch) throws Throwable {
		List<WebElement> elements = findListOfElementsByXpath(elementToSearch);
		textToSearch= property.getProperty(webTextPropertyFile, textToSearch);
		
		System.out.println("Element to search ::"+textToSearch);
		
        for(WebElement e:elements){
        	System.out.println("Element text ::" + e.getText().trim());
        	System.out.println("-----------------------------------");
            if(e.getText().trim().equals(textToSearch.trim())){ 
            	System.out.println(e.getText() + "is appearing!!!");
            	return e;	
            }
        }
		return null;
	}
	
	public String getElementText(String location) throws Throwable {
		element = findElementByXpath(location);
		return element.getText().trim();
	}
	
	public void clickOnSelectedTextFromList(String textToSearch, String elementToSearch) throws Throwable {
		element = searchSelectedElementFromList(textToSearch,elementToSearch);
		waitForPageToLoadImplicitly();
		element.click();
	}
	
	public WebElement findElementByID(String elementPath) throws Throwable {
		String strPropertyVal = property.getProperty(locatorsPropertyFile, elementPath);
		if(strPropertyVal.startsWith("//"))
		{
			return driver.findElement(By.xpath(property.getProperty(locatorsPropertyFile, elementPath)));
		}
		else
		{
			return driver.findElement(By.id(property.getProperty(locatorsPropertyFile, elementPath)));
		}	
		
	}
	
	public String getCurrentURLAsText() {
		return driver.getCurrentUrl();
	}
	
	public WebElement findElementByXpath(String elementPath) throws Throwable {
		return driver.findElement(By.xpath(property.getProperty(locatorsPropertyFile, elementPath)));
	}
	
	public List<String> getKeyboardShortcuts(String elementPath) throws Throwable
	{
		String strPropertyVal = property.getProperty(locatorsPropertyFile, elementPath);
		System.out.println("strPropertyVal : " + strPropertyVal);
		List<WebElement> element = driver.findElements(By.xpath(strPropertyVal));
		List<String> actualList = new ArrayList<String>();
		String liText;
		for(WebElement e:element)
		{
			liText = e.getText();
			actualList.add(liText);
		}
		return actualList;
	}
	
	public List<String> getKeyboardShortcutData() throws IOException
	{
		List<String> expectedList = new ArrayList<String>();
		File file = new File(keywordTextPropertyFile); 
		  
		  br = new BufferedReader(new FileReader(file)); 
		  String st; 
		  while((st = br.readLine()) != null) {
		    expectedList.add(st);
		  };
		
		return expectedList;
	}
	
	public void waitForPageToLoadImplicitly() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
}
