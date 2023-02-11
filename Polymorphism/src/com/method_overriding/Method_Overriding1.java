package com.method_overriding;

public class Method_Overriding1 extends MethodOverriding {

	@Override   // This Annotation used to overrided method
	public void m1(int p, int q) {                // m1 method is already define into parent class andwe overrided here 
		System.out.println("Value of p:"+ p);     // but implementation is different such as different variable and Syso
		System.out.println(" value of q:" + q);
	}
	@Override
	public void m2(int x, int y) {
		System.out.println(" value of x:" + x);
		System.out.println(" value of y:" + y);
		
	}
}
