package com.test.kenzan;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.kenzan.FizzBuzzValidator;

public class FizzBuzzValidatorTest {

	FizzBuzzValidator fizzBuzzValidator = new FizzBuzzValidator();
	
	@Test
	public void testUpperBoundary() {
		boolean isValidInput = fizzBuzzValidator.validateUserInput("101");
		assertFalse(isValidInput);
	}
	
	@Test
	public void testLoweBoundary() {
		boolean isValidInput = fizzBuzzValidator.validateUserInput("0");
		assertFalse(isValidInput);
	}
	
	@Test
	public void testAlphabicInput() {
		boolean isValidInput = fizzBuzzValidator.validateUserInput("hjk");
		assertFalse(isValidInput);
	}
	
	@Test
	public void testAlphaNumeric() {
		boolean isValidInput = fizzBuzzValidator.validateUserInput("hh55");
		assertFalse(isValidInput);
	}
	
	@Test
	public void testDecimalValues() {
		boolean isValidInput = fizzBuzzValidator.validateUserInput("12.5");
		assertFalse(isValidInput);
	}
	
	@Test
	public void testValidInput() {
		boolean isValidInput = fizzBuzzValidator.validateUserInput("31");
		assertTrue(isValidInput);
	}
	
	@Test
	public void testValidInputLowerLimit() {
		boolean isValidInput = fizzBuzzValidator.validateUserInput("1");
		assertTrue(isValidInput);
	}
	
	@Test
	public void testValidInputUpperLimit() {
		boolean isValidInput = fizzBuzzValidator.validateUserInput("1");
		assertTrue(isValidInput);
	}

}
