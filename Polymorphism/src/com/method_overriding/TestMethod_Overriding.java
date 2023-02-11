package com.method_overriding;

public class TestMethod_Overriding {
	
	public static void main(String[] args) {
		
		 Method_Overriding1 m = new  Method_Overriding1();  // Obj creation of child class
		                    m.m1(5, 7);                     //Overrided method call with int value
		                    m.m2(2, 3);
		}
}
