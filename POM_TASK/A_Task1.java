package POM_TASK;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import BaseClass.BaseClass;

public class A_Task1 extends BaseClass {
	@BeforeClass
	public static void beforeclass() {
		browserLaunch();maximize();getURL("https://www.facebook.com/");implicitWait();
		

	}
	@Test
	public void FBlogin() throws IOException {
		A_Task FB=new A_Task();
		FB.FBLogin(getCellValueof("FB", 2, 1), getCellValueof("FB", 2, 2));
		

	}

}
