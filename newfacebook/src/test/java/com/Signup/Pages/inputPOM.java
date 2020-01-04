package com.Signup.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Signup.Utilities.base;

public class inputPOM extends base{
	
public inputPOM() {
	PageFactory.initElements(driver, this);
	
}

@FindBy(name="firstname")
public WebElement Firstname;
@FindBy(id="u_0_h")
public WebElement Lastname;
@FindBy(name="reg_email__")
public WebElement Number;
@FindBy(id="u_0_p")
public WebElement password;

}
