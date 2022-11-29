package com.ds.utility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ds.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("TestCase execution started" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("TestCase execution Completed" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("TestCase execution failed" + result.getName());
		UtilClass.takeScreenShot(result.getName()+System.currentTimeMillis());
		logger.info("Take screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("TestCase execution skipped" + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
