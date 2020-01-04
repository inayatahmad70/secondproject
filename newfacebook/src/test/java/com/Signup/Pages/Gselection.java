package com.Signup.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Signup.Utilities.base;

public class Gselection extends base {
	public Gselection() {
		PageFactory.initElements(driver, this);
		
		
	}
 @FindBy(id="u_0_a")
 public WebElement male;
}
