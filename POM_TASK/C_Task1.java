package POM_TASK;



import org.junit.BeforeClass;
import org.junit.Test;

import BaseClass.BaseClass;

public class C_Task1 extends BaseClass {
	
	@BeforeClass
	public static void beforeclass() {
		browserLaunch();maximize();getURL("http://www.greenstechnologys.com/index.html");implicitWait();
		

	}
	@Test
	public void GreenTechnology() {
		
	}
	
}
