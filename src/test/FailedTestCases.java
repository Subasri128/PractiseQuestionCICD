package test;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class FailedTestCases {

	@Test
	public void executeFailTestCase() {
		TestNG runner = new TestNG();
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("C:\\Users\\a819538\\eclipse-workspace\\learning\\test-output\\Default suite\\testng-failed.xml");
		runner.setTestSuites(arrayList);
		runner.run();
	}
}
