package POM_TASK;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class A_Task extends BaseClass {
	
	public A_Task() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='email']")
	private WebElement UserName;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login;

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}
	public void FBLogin(String venkatesh, String venky) {
		elementSendKeys(UserName, venkatesh);
		elementSendKeys(Password, venky);
		ElementClick(Login);
	}
	
	
}
