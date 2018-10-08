package com.fdmgroup.HelloWorldTests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.helloworld.HelloWorld;

public class HelloWorldTests {

	@Test
	public void test_Method1() {
		
		assertEquals("Hello World", HelloWorld.CreateMessage());
		
	}

}
