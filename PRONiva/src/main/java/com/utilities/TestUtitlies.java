package com.utilities;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class TestUtitlies {

	public String randomAlphabetic(int count) {
		return RandomStringUtils.randomAlphabetic(count);
	}

	public String randomAlphaNumeric(int count) {
		return RandomStringUtils.randomAlphanumeric(count);
	}
	
	public String randomNumeric(int count) {
		return RandomStringUtils.randomNumeric(count);
	}
	

}
