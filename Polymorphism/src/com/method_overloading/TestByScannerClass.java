package com.method_overloading;

import java.util.Scanner;

public class TestByScannerClass {
	
	public static void main(String[] args) {
		System.out.println("take the int value");
		Scanner s = new Scanner(System.in);
		   int a = s.nextInt();
		   int a1 = s.nextInt();
		  
		 System.out.println("take the float value");
		   float b =s.nextFloat();
		   float b1 = s.nextFloat();
		   System.out.println("Take the double");
		     double c =s.nextDouble();
		     System.out.println("Take the int Value");
		        int d = s.nextInt();
		        int d1= s.nextInt();
		        int d2=s.nextInt();
		        
		       ByScannerClass byScannerClass = new ByScannerClass();
		                      byScannerClass.addition(a1, a);
		                      byScannerClass.addition(b,b1);
		                      byScannerClass.addition(c);
		                      byScannerClass.addition(d, d1, d2);
		        }
}
