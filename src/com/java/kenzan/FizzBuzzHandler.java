package com.java.kenzan;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzHandler {
	
	private static final Integer THREE = 3;
	
	private static final Integer FIVE = 5;
	
	private static final Integer FIFTEEN = 15;

	/**
	 * getFizzList will have list of those values which are under inputAsInteger
	 * and divisible by 3.
	 * 
	 * @param inputAsInteger
	 * @return
	 */
	public List<Integer> getFizzList(Integer inputAsInteger) {
		List<Integer> fizzList = new ArrayList<Integer>();
		int modulusValue = inputAsInteger % THREE;

		int loopMaxLimit = (inputAsInteger - modulusValue) / THREE;
		for (int i = 1; i < loopMaxLimit + 1; i++) {

			int valueToAddInList = i * THREE;
			if (valueToAddInList < inputAsInteger) {
				fizzList.add(valueToAddInList);
			}
		}

		return fizzList;
	}

	/**
	 * getBuzzList will have list of those values which are under inputAsInteger
	 * and divisible by 5.
	 * 
	 * @param inputAsInteger
	 * @return
	 */
	public List<Integer> getBuzzList(Integer inputAsInteger) {
		List<Integer> buzzList = new ArrayList<Integer>();
		int modulusValue = inputAsInteger % FIVE;

		int loopMaxLimit = (inputAsInteger - modulusValue) / FIVE;
		for (int i = 1; i < loopMaxLimit + 1; i++) {

			int valueToAddInList = i * FIVE;
			if (valueToAddInList < inputAsInteger) {
				buzzList.add(valueToAddInList);
			}
		}

		return buzzList;
	}

	/**
	 * getFizzBuzzList will have list of those values which are under
	 * inputAsInteger and divisible by 3 and 5 together.
	 * 
	 * @param inputAsInteger
	 * @return
	 */
	public List<Integer> getFizzBuzzList(Integer inputAsInteger) {
		List<Integer> fizzBuzzList = new ArrayList<Integer>();
		int modulusValue = inputAsInteger % FIFTEEN;

		int loopMaxLimit = (inputAsInteger - modulusValue) / FIFTEEN;
		for (int i = 1; i < loopMaxLimit + 1; i++) {

			int valueToAddInList = i * FIFTEEN;
			if (valueToAddInList <= inputAsInteger) {
				fizzBuzzList.add(valueToAddInList);
			}
		}
		return fizzBuzzList;
	}
}
