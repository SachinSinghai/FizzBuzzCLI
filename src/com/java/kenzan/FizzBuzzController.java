package com.java.kenzan;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FizzBuzzController {

	private static final String FIZZ = "Fizz: ";
	private static final String BUZZ = "Buzz: ";
	private static final String FIZZBUZZ = "FizzBuzz: ";

	/**
	 * This method will be called first, when this program will be run.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("****** Welcome To Kenzan Assignment ******");
		FizzBuzzController fizzBuzzControllerObj = new FizzBuzzController();
		fizzBuzzControllerObj.handleUsersInput(fizzBuzzControllerObj);
	}

	/**
	 * handleUsersInput, it handles the input value and create the expected
	 * output. It will prompt to user for input until an integer value between 1
	 * and 100 (both included) is passed.
	 */
	private void handleUsersInput(FizzBuzzController fizzBuzzControllerObj) {

		// scannerToScanInput to read the input from command line
		@SuppressWarnings("resource")
		Scanner scannerToScanInput = new Scanner(System.in);

		// prompt for the user's input upper boundry
		System.out.print("Enter FizzBuzz upper boundry: ");

		String inputValue = scannerToScanInput.next();

		FizzBuzzValidator fizzBuzzValidator = new FizzBuzzValidator();

		if (fizzBuzzValidator.validateUserInput(inputValue)) {

			Integer inputAsInteger = Integer.valueOf(inputValue);

			if (null != inputAsInteger) {
				fizzBuzzControllerObj.createOutput(inputAsInteger);
			}
		} else {
			handleUsersInput(fizzBuzzControllerObj);
		}
	}

	/**
	 * createOutput, this method has logic to create values for output on the
	 * basis of input.
	 * 
	 * @param inputAsInteger
	 * @return
	 */
	private void createOutput(Integer inputAsInteger) {
		FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();

		List<Integer> fizzOutput = fizzBuzzHandler.getFizzList(inputAsInteger);

		List<Integer> buzzOutput = fizzBuzzHandler.getBuzzList(inputAsInteger);

		List<Integer> fizzBuzzoutput = fizzBuzzHandler.getFizzBuzzList(inputAsInteger);

		// Creating output for Fizz
		StringBuffer output = new StringBuffer(FIZZ + Arrays.toString(fizzOutput.toArray()) + "\n");

		// Creating output for BUzz and appending to Fizz output
		output = output.append(BUZZ + Arrays.toString(buzzOutput.toArray()) + "\n");

		// Creating output for FizzBuzz and appending to Fizz+Buzz output
		output = output.append(FIZZBUZZ + Arrays.toString(fizzBuzzoutput.toArray()));

		// removing unwanted characters and printing the output to console.
		System.out.println(output.toString().replace("[", "").replace("]", ""));
	}

}
