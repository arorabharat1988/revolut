package stepDefinition;

import common.BaseFunction;
import common.CommonFunction;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.PropertyUtils;
import java.util.List;
import org.junit.Assert;



public class CommunityPageStepDef {
	
	BaseFunction baseFunc = new BaseFunction();
	CommonFunction commonFunc = new CommonFunction();
	PropertyUtils property = new PropertyUtils();
	
	private final String webTextPropertyFile = "/src/test/resources/properties/webText/text.properties";
	
	@Before
	public void setsession() {
		baseFunc.initializeChromeDriver();
	}
	@Given("^User navigates to \"([^\"]*)\" Page$")
	public void user_navigates_to_Page(String url) throws Throwable {
		System.out.println("inside steps : " + url);
		baseFunc.openPage(url);	    
	}

	@When("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_on_Page(String elementToClick) throws Throwable {
		commonFunc.waitForPageToLoadImplicitly();
		commonFunc.clickOnElement(elementToClick);
	}
	
	@And("^User enters \"([^\"]*)\" in \"([^\"]*)\"$")
	public void user_enters_text_in_textBox(String textToEnter, String location) throws Throwable {
	    commonFunc.setElementText(textToEnter, location);
	}
	
	@When("^User clicks on \"([^\"]*)\" from \"([^\"]*)\"$")
	public void user_clicks_on_text_from_search_dropdown(String selectedText, String location) throws Throwable {
		commonFunc.clickOnSelectedTextFromList(selectedText,location);
	}
	
	@Then("^Verify \"([^\"]*)\" should appear in \"([^\"]*)\"$")
	public void verify_searched_topic_should_appear_in_dropdown(String textToSearch, String location) throws Throwable{
		String selectedTextFound = commonFunc.searchSelectedElementFromList(textToSearch,location).getText().trim();
		textToSearch = property.getProperty(webTextPropertyFile, textToSearch);
		Assert.assertEquals("Selected Search Text is not Appearing", textToSearch, selectedTextFound);
	}
	
	@Then("^Verify \"([^\"]*)\" is appearing as \"([^\"]*)\" on opened page$")
	public void verify_selected_Text_is_appearing_on_opened_page(String textToCheck, String location) throws Throwable {
		commonFunc.waitForPageToLoadImplicitly();
		String selectedTextOnTitle = commonFunc.getElementText(location);
		textToCheck = property.getProperty(webTextPropertyFile, textToCheck);
		Assert.assertEquals("Selected Search Text is not Appearing", textToCheck, selectedTextOnTitle);
	}
	
	@Then("^User validate the content of \"([^\"]*)\"$")
	public void user_validate_the_content_of_placeHolder(String arg1) throws Throwable {	   
		List<String> actualList = commonFunc.getKeyboardShortcuts(arg1);
		List<String> expectedList = commonFunc.getKeyboardShortcutData();
		System.out.println("arrActual : " + actualList);
		System.out.println("arrExpected : " + expectedList);
		Assert.assertEquals("Hamburger Keyword Doesn't Match!!", expectedList, actualList);	
	}
	
	@Then("^User validate that correct Url opens up for \"([^\"]*)\"$")
	public void user_validate_that_correct_url_opens_up_for_revolut(String countryURLText) throws Throwable {
		commonFunc.waitForPageToLoadImplicitly();
		String getActualURLText = commonFunc.getCurrentURLAsText();
		String getExpctedUrl=property.getProperty(webTextPropertyFile,countryURLText);
		Assert.assertEquals("Country URL Doesn't Match", getExpctedUrl, getActualURLText);
	}
	
	@After
	public void tearDown() {
		baseFunc.closeDriver();
	}
	
}
