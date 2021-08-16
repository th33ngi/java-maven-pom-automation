package com.focus.utility;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsManager {
	Properties prop;
	ChromeOptions chromeOptions;
	FirefoxOptions firefoxOptions;
	FirefoxProfile firefoxProf;
	
	public OptionsManager(Properties prop) {
		this.prop = prop;
	}
	
	public ChromeOptions getChromeOptions() {
		chromeOptions = new ChromeOptions();
		/*chromeOptions.addArguments("headless");
		chromeOptions.addArguments("window-size=1280x800");
		chromeOptions.addArguments("no-sandbox");
		chromeOptions.addArguments("–disable-dev-shm-usage");
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--disable-gpu");
		chromeOptions.addArguments("--disable-setuid-sandbox");*/
		chromeOptions.setBinary("/usr/bin/google-chrome");
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--disable-dev-shm-usage");
		return chromeOptions;
	}
	
	public FirefoxOptions getFirefoxOptions() {
		firefoxOptions = new FirefoxOptions();
		firefoxProf = new FirefoxProfile();
			firefoxProf.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf;text/plain;application/text;text/xml;application/xml");
			firefoxProf.setPreference("pdfjs.disabled", true);
		return firefoxOptions;
	}
}
