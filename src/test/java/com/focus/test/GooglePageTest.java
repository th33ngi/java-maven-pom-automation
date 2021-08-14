package com.focus.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.base.BaseTest;
import com.focus.page.GooglePage;

public class GooglePageTest extends BaseTest {
	
	@Test(priority=1, enabled=true)
	public void verifyGooglePage() {
		String title = page.getInstance(GooglePage.class).getGooglePageTitle();
		System.out.println("We are on: "+title+" Page");
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2, enabled=true)
	public void reachFocusServicesPage() {
		page.getInstance(GooglePage.class).searchFocusPage("Focus Services");
		Boolean result = page.getInstance(GooglePage.class).isFocusServicesLLC();
		Assert.assertTrue(result);
	}
}