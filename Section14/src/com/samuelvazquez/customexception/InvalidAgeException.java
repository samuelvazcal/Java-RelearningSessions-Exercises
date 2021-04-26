package com.samuelvazquez.customexception;

//class to create custom exceptions and extends exception
public class InvalidAgeException extends Exception{
	InvalidAgeException(String s) {
		//calling the super constructor
		super(s);
	}
}
