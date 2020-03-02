package com.mv.GetsPlacements1;

import org.testng.annotations.DataProvider;

/**
 * @author Akash
 *
 */
public class TestData {

	@DataProvider(name = "InputData")
	public Object[][] getDataforEditField() {
		// 2 sets of data
		return new Object[][] {

				{ new Helper("29e2b7a0", "acdbfced", "da596ae4") } };
	}

}

class Helper {
	Helper(String data1, String data2, String data3) {
		this.token1 = data1;
		this.token2 = data2;
		this.token3 = data3;
	}

	String token1;
	String token2;
	String token3;
}
