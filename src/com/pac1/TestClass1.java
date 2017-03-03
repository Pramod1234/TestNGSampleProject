package com.pac1;

import org.openqa.selenium.WebDriver;

public class TestClass1 {

	static WebDriver driver;

	public static void main(String[] args) {
		System.out.println("Start Line....");
	int i, j, k, n = 10;
		for (i = 0; i < n; i++) {
			for (j = n - i - 1; j > 0; j--)
				System.out.print(" ");
			for (j = 0; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}

		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < i + 1; j++)
				System.out.print(" ");
			for (j = 0; j < n - 1 - i; j++)
				System.out.print("* ");
			System.out.println();
		}

		for (i = 0; i < n; i++) {
			for (j = n - i; j > 0; j--)
				System.out.print("* ");
			System.out.println();
		}

		 driver.close();
		// driver.findElement(By.className("sub-container")).click();
	}
}
