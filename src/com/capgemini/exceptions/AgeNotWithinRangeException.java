package com.capgemini.exceptions;

public class AgeNotWithinRangeException extends Exception{
	
	public AgeNotWithinRangeException() {
		
	}
	public AgeNotWithinRangeException(String student) {
		super(student);
	}
}
