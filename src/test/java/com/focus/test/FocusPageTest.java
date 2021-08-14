package com.focus.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.base.BaseTest;
import com.focus.page.FocusPage;
import com.focus.page.GooglePage;

public class FocusPageTest extends BaseTest {
	
	@Test(priority=3, enabled=true)
	public void navigateToFocusServicesPage() {
		page.getInstance(GooglePage.class).getFocusPage("https://www.focusservices.com/");
		String title = page.getInstance(FocusPage.class).getFocusPageTitle();
		System.out.println("We are on: "+title+" Page");
		Assert.assertEquals(title, "Focus Services – Beyond Expectations");
	}
	
	@Test(priority=4, enabled=true)
	public void scrollDownFocusServicesPage() {
		Boolean result = page.getInstance(FocusPage.class).scrollDownFocusPage();
		Assert.assertTrue(result);
	}
	
	@Test(priority=5, enabled=true)
	public void verifyNowHiringButton() {
		Boolean result = page.getInstance(FocusPage.class).isNowHiringButton();
		System.out.println("Does hiring button exist ?: "+result);
		Assert.assertTrue(result);
	}
	
	@Test(priority=6, enabled=true)
	public void navigateToLocationsTab() {
		Boolean result = page.getInstance(FocusPage.class).getLocationTab();
		System.out.println("Are we on Locations Tab ?: "+result);
		Assert.assertTrue(result);
	}
	
	@Test(priority=7, enabled=true)
	public void locateNorthAmericaLink() {
		String url = page.getInstance(FocusPage.class).getNorthAmericaUrl();
		System.out.println("We are on: "+url);
		Assert.assertEquals(url, "https://www.focusservices.com/locations/#north-america");
	}
	
	@Test(priority=8, enabled=true)
	public void navigateToCentralAmericaPage() {
		String url = page.getInstance(FocusPage.class).getCentralAmericaPage();
		System.out.println("We are on: "+url);
		Assert.assertEquals(url, "https://www.focusservices.com/locations/#central-america");
	}
	
	@Test(priority=9, enabled=true)
	public void verifyElSalvadorAndNicaraguaTitle() {
		Boolean result = page.getInstance(FocusPage.class).isElSalvadorAndNicaragua();
		System.out.println("Is El Salvador & Nicaragua title displayed ?: "+result);
		Assert.assertTrue(result, "El Salvador & Nicaragua");
	}
	
	@Test(priority=10, enabled=true)
	public void navigateToAsiaPage() {
		String url = page.getInstance(FocusPage.class).getAsiaPage();
		System.out.println("We are on: "+url);
		Assert.assertEquals(url, "https://www.focusservices.com/locations/#asia");
	}
	
	@Test(priority=10, enabled=true)
	public void verifyBacolodCityAndPhilippinesBlock() {
		Boolean result = page.getInstance(FocusPage.class).isBacolodCityAndPhilippines();
		System.out.println("Is Bacolod City & Philippines Block displayed ?: "+result);
		Assert.assertTrue(result);
	}
}