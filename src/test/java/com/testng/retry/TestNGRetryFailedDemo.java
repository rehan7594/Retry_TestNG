package com.testng.retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
		//int i = 1/0;
	}
	
	@Test(retryAnalyzer = com.testng.retryAnalyser.RetryAnalyser.class)
	public void test3() {
		System.out.println("I am inside Test 3");
		Assert.assertTrue(0>1);
	}
}
