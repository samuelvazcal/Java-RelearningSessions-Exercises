package com.samuelvazquez.customexception;

class TestCustomException1 {
	//method where we are gonna throw our new exception, we declared in the method signature
	static void validate(int age) throws InvalidAgeException {
		if(age < 18) {
			//throwing the exception creating an instance of the Exception class that we already created
			throw new InvalidAgeException("not valid");
		} else {
			System.out.println("welcome to vote");
		}
	}


	public static void main(String[] args) {
		//main class where we are gonna test the created custom exception
		try {
			//calling the method
			validate(13);
			//catching the exception
		} catch(Exception m) {
			System.out.println("Exception occurred: " + m);
			System.out.println("rest of the code");
		}
	}

}
