package com.java.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;


@DisplayName("TESTING EMPLOYEE TASKS")
public class TestEmployee {
	
	
//	@BeforeAll
//	public static void setUpOnce() {
//		System.out.println("From oneTime setup");
//	}
//	
//	@BeforeEach
//	public void setUp() {
//		System.out.println("before each");
//	}
//	@Test
//	@DisplayName("TESTING SAVE METHOD")
//	public void testSave() {
//		System.out.println("Hello-Save");
//	}
//	
//	
//	@Test
//	@DisplayName("TESTING UPDATE METHOD")
//	@Tag("prod")
//	public void testUpdate() {
//		System.out.println("Hello-Update");
//	}
//	
//	@Test
//	@DisplayName("TESTING DELETE METHOD")
//	@Tag("dev")
//	public void  testDelete() {
//		System.out.println("Hello-delete");
//	}
//	
//	@AfterEach
//	public void clear() {
//		System.out.println("clear method");
//	}
//	
//	@AfterAll
//	public static  void closeAll() {
//		System.out.println("once at end");
//	}
	
//	@RepeatedTest(value=3)
//	@DisplayName("MULTIPLY TEST")
//	public void testMultiply(TestInfo info) {
//		System.out.println("Hello"+info.getTestClass().get().getName());
//		System.out.println("Hello"+info.getTestMethod().get().getName());
//		System.out.println("Hello"+info.getDisplayName());
//	}
	
	
	@Test
	void sum() {
		int expected = 2;
		assertEquals(expected, 2);
		System.out.println("hi this is sum method");
	}
	
}
