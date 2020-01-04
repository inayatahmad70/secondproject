package com.Signup.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Signup.Utilities.base;

public class submitPOM  extends base{
public submitPOM() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(id="u_0_w")
public WebElement submit;


}
