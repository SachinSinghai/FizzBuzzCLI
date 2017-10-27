package com.java.kenzan;

public class FizzBuzzValidator {

	/**
	 * Validates the input value from user. Input value should be between 1 and
	 * 100 both values are included.
	 * 
	 * @param inputValue
	 * @return
	 */
	public boolean validateUserInput(String inputValue) {
		boolean isValidInput = false;
		try {
			Integer inputAsInteger = Integer.valueOf(inputValue);

			if (inputAsInteger < 1) {
				System.out.println(inputValue + " is lesser than allowed values.");
				return isValidInput;

			} else if (inputAsInteger > 100) {
				System.out.println(inputValue + " is greater than allowed values.");
				return isValidInput;
			}

		} catch (Exception ex) {
			System.out.println(inputValue + " is not an integer value.");
			return isValidInput;

		}
		return true;
	}
}
