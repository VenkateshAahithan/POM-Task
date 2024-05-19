package POM_TASK;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class C_Task extends BaseClass {
	
	public C_Task() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//u[text()='Greens Technologys Software Training Center in Salem']")
	private WebElement PrintText;
	
	@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement PrintTextsoftware;
	
	@FindBy(xpath="//a[contains(text(),'Certifications')]")
	private WebElement ClickCertification;
	
	@FindBy(xpath="(//a[text()='Course Content'])[29]")
	private WebElement ClickSelenium;
	
	public void FBLogin() {
		pagescrolldown(PrintText);
		ElementGetText(PrintText);
		
		
	}
	
	
}
