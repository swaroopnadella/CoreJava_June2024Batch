package testAccessModifier;

import day22.Test;

public class TestMain {
	
	public static void main(String[] args) {
		
		Test object = new Test();
		int a = object.x;
		System.out.println(a);
		object.method();

	}

}
