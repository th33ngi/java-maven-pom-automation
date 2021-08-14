package com.focus.utility;

import java.util.HashMap;
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
			HashMap <String, Object> chromePrefs = new HashMap <String, Object>();
			chromePrefs.put("plugins.always_open_pdf_externally", true);
			chromeOptions.setExperimentalOption("prefs", chromePrefs);
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
