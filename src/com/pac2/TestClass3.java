package com.pac2;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class TestClass3 {

	@Test
	public void testMethod1() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:SS");
		System.out.println(dateFormat.format(date));
		System.out.println(Thread.currentThread().getId());
		System.out.println("In TestMethod1 of Class3");
	}

	@Test
	public void testMethod2() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:SS");
		System.out.println(dateFormat.format(date));
		System.out.println(Thread.currentThread().getId());
		System.out.println("In TestMethod2 of Class3");
	}
}
