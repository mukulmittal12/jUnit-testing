package com.example.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();

	@Before
	public void before() {
		System.out.println("before");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
	
	@Test
	public void sumOf3Numbers() {
		int result = myMath.sum(new int[] {1,2,3});
		assertEquals(6, result);
		System.out.println(result);
	}
	
	@Test
	public void sumOf1Number() {
		int result = myMath.sum(new int[] {3});
		assertEquals(3, result);
		System.out.println(result);
	}
}
