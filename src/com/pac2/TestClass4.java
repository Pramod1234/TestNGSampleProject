package com.pac2;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass4 {

	@Test
	public void testMethod1() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:SS");
		System.out.println(dateFormat.format(date));
		System.out.println(Thread.currentThread().getId());
		System.out.println("In TestMethod1 of Class4");
	}

	@Test
	public void testMethod2() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:SS");
		System.out.println(dateFormat.format(date));
		System.out.println(Thread.currentThread().getId());
		System.out.println("In TestMethod2 of Class4");
	}

	@BeforeTest
	public void testMethod4() {
		System.out.println("In before test");
	}

	@BeforeMethod
	public void testMethod5() {
		System.out.println("In before method");
	}

	@BeforeClass
	public void testMethod6() {
		System.out.println("In before class");
	}

}
