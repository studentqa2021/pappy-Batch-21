package com.TestRun;

public class SwapValue2 {
	
	public void getswapvalue(int a, int b){
		System.out.println("a value before swap = "+ a);
		System.out.println("b value before swap = "+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a value after swap = "+ a);
		System.out.println("b value after swap = "+ b);
		
		
		
	}

	public static void main(String[] args) {
		SwapValue2 obj = new SwapValue2();
		obj.getswapvalue(10, 20);
		
	}
}
