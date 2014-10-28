package handle;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//对driver的封装

public class Handler {
	
	private Common		common;
	private WebDriver	driver;
	
	public Handler(WebDriver driver) {
		this.driver = driver;
		this.common = new Common(driver);
		
	}
	
	public void checkXpath(String xpath) throws Exception {
		Thread.sleep(1000);
		Assert.assertTrue(common.getElementByXpath(xpath) != null);
	}
	
	public void checkXpathNotExist(String xpath) throws Exception {
		Thread.sleep(1000);
		Assert.assertTrue(common.getElementByXpath(xpath) == null);
	}
	
	public void checkXpathIsDisplayed(String xpath) throws Exception {
		Thread.sleep(1000);
		Assert.assertTrue(common.getElementByXpath(xpath).isDisplayed());
	}
	
	public void clickXpath(String xpath) throws Exception {
		Thread.sleep(1000);
		common.waitForLoad(xpath);
		Thread.sleep(1000);
		common.getElementByXpath(xpath).click();
		Thread.sleep(3000);
	}
	
	public void clickText(String text) throws Exception {
		Thread.sleep(1000);
		Assert.assertTrue(common.getElementByText(text).isDisplayed());
		Thread.sleep(1000);
		common.getElementByText(text).click();
	}
	
	public void inputText(String xpath, String text) throws Exception {
		Thread.sleep(1000);
		common.waitForLoad(xpath);
		Thread.sleep(1000);
		WebElement w = common.getElementByXpath(xpath);
		w.clear();
		Thread.sleep(1000);
		w.sendKeys(text);
		
	}
	
	public void checkTextByXpath(String xpath, String text) throws Exception {
		Thread.sleep(1000);
		common.waitForLoad(xpath);
		Thread.sleep(1000);
		Assert.assertTrue(common.getElementByXpath(xpath).getText()
				.equals(text));
		
	}
	
	public void checkText(String text) throws InterruptedException {
		Assert.assertTrue(common.getElementByText(text) != null);
		Thread.sleep(1000);
		
	}
	
	public String getTextByXpath(String xpath) throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(common.getElementByXpath(xpath).getText() != null);
		return common.getElementByXpath(xpath).getText();
	}
	
	public void checkTextIsMissing(String text) throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(common.getElementByText(text) == null);
		
	}
	
	public void refreshPage() throws InterruptedException {
		getDriver().navigate().refresh();
		Thread.sleep(2000);
	}
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public Common getCommon() {
		return common;
	}
	
	
	
}
