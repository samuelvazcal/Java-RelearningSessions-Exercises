package com.samuelvazquez.exceptionsinmethodoverriding;


class Parent3{
	void msg()throws ArithmeticException{System.out.println("parent");}
}

class TestExceptionChild3 extends Parent3{
	//If the superclass method declares an exception,
	//subclass overridden method can declare same, subclass
	//exception or no exception but cannot declare parent exception.

	//void msg()throws Exception{
	//	System.out.println("child");
	//}

	public static void main(String args[]){
		Parent3 p=new TestExceptionChild3();
		try{
			p.msg();
		}catch(Exception e){}
	}
}
