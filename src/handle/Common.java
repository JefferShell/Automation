package handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

//对浏览器的操作

public class Common {
	
	private WebDriver	driver;
	
	public Common(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElementByXpath(String xpath) {
		try {
			return driver.findElement(By.xpath(xpath));
		} catch (Exception e) {
			return null;
		}
	}
	
	public WebElement getElementByText(String text) {
		try {
			return driver.findElement(By.linkText(text));
		} catch (Exception e) {
			return null;
		}
	}
	
	public By getBy(String xpath) {
		return By.xpath(xpath);
	}
	
	public void waitForLoad(String xpath) {
		final By elementBy = By.xpath(xpath);
		WebDriverWait wait = (new WebDriverWait(driver, 20));
		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				boolean loadcomplete = d.findElement(elementBy).isDisplayed();
				return loadcomplete;
			}
		});
	}
}
