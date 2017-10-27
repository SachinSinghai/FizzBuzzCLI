package com.test.kenzan;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.java.kenzan.FizzBuzzHandler;

public class FizzBuzzHandlerTest {

	@Test
	public void testGetFizzListInvalidInput() {
		FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();
		List<Integer> resultList =  fizzBuzzHandler.getFizzList(1);
		assertEquals(0, resultList.size());
	}
	
	@Test
	public void testGetFizzListValidInputLowerLimit() {
		FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();
		List<Integer> resultList =  fizzBuzzHandler.getFizzList(4);
		assertEquals(1, resultList.size());
	}
	
	@Test
	public void testGetFizzListValidInputUpperLimit() {
		FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();
		List<Integer> resultList =  fizzBuzzHandler.getFizzList(100);
		assertEquals(33, resultList.size());
	}
	
	@Test
	public void testGetBuzzListInvalidInput() {
		FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();
		List<Integer> resultList =  fizzBuzzHandler.getBuzzList(5);
		assertEquals(0, resultList.size());
	}
	
	@Test
	public void testGetBuzzListValidInputLowerLimit() {
		FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();
		List<Integer> resultList =  fizzBuzzHandler.getBuzzList(6);
		assertEquals(1, resultList.size());
	}
	
	@Test
	public void testGetBuzzListValidInputUpperLimit() {
		FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();
		List<Integer> resultList =  fizzBuzzHandler.getBuzzList(100);
		assertEquals(19, resultList.size());
	}

	@Test
	public void testGetFizzBuzzListInvalidInput() {
		FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();
		List<Integer> resultList =  fizzBuzzHandler.getFizzBuzzList(14);
		assertEquals(0, resultList.size());
	}
	
	@Test
	public void testGetFizzBuzzListValidInputLowerLimit() {
		FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();
		List<Integer> resultList =  fizzBuzzHandler.getFizzBuzzList(15);
		assertEquals(1, resultList.size());
	}
	
	@Test
	public void testGetFizzBuzzListValidInputUpperLimit() {
		FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();
		List<Integer> resultList =  fizzBuzzHandler.getFizzBuzzList(100);
		assertEquals(6, resultList.size());
	}
}
