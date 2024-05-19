package POM_TASK;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import BaseClass.BaseClass;

public class B_Task1 extends BaseClass {
	
	
	@BeforeClass
	public static void beforeclass() {
		browserLaunch();maximize();getURL("https://www.toolsqa.com/selenium-training/#enroll-form");implicitWait();
		
	}
	@Test
	public void ToolsqaRegister() throws IOException {
		B_Task TS=new B_Task();
		TS.ToolSqaRegister(getCellValueof("ToothSqaRegister", 2, 1), 
				getCellValueof("ToothSqaRegister", 2, 2),
				getCellValueof("ToothSqaRegister", 2, 4),
				getCellValueof("ToothSqaRegister", 2, 3),
				getCellValueof("ToothSqaRegister", 2, 5),
				getCellValueof("ToothSqaRegister", 2, 7),
				getCellValueof("ToothSqaRegister", 2, 6));
	}

}
