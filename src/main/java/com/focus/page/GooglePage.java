package com.focus.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.focus.base.BasePage;
import com.focus.utility.WebElements;

public class GooglePage extends BasePage{
	WebElements webElement;
	List<WebElement> elements;

	public GooglePage (WebDriver driver) {
		super(driver);
		webElement = new WebElements(driver);
	}
	
	//Page locator
	By inputName = By.name("q");
	By aTagName = By.tagName("a");
	By span = By.xpath("//h2/span[contains(text(),'Focus Services LLC.')]");
	
	public String getGooglePageTitle() {
		return webElement.getPageTitle();
	}
	
	public GooglePage searchFocusPage(String param) {
		webElement.sendKeys(inputName, param);
		return new GooglePage(driver);
	}
	
	public FocusPage getFocusPage(String param) {
		elements = webElement.findElements(aTagName);
		for (WebElement page : elements) {
			if (param.equals(page.getAttribute("href"))) {
				page.click();
				break;
			}
		}
		return new FocusPage(driver);
	}
	
	public Boolean isFocusServicesLLC() {
		return	webElement.isDisplayed(span);
	}
}