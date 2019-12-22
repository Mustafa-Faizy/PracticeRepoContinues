package pageObject;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PracticeTaskPageObjects extends Base {
	
	
	
	public PracticeTaskPageObjects () {
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(how = How.XPATH, using = "//title[text()='TEK School – Knowledge is power']")
	
	
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//title[text()='TEK School – Knowledge is power']")
	private WebElement tekSchoolTitleWebElement;
	
	public void tekSchoolTitleVerification() {
		
		 tekSchoolTitleWebElement.isDisplayed();
		
	}
	
	
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//li[@id='menu-item-8162']")
	private WebElement clickOnTestEnvironmentWebElement;
	
	public void clickingOnTestEnvironment() {
		try {
		clickOnTestEnvironmentWebElement.click();
		}
		catch (Exception e) {
			clickOnTestEnvironmentWebElement.sendKeys(Keys.ENTER);
		}
	}
	
	

	@FindBy(how = How.XPATH, using = "//a[text()='TEK SCHOOL']")
	private WebElement testEnvironmentTitleWebElement;
	
	public void testEnvironmentTitleVerificatin() {
		
		testEnvironmentTitleWebElement.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
