package com.infy.package1;

public class DemoTwo extends DemoOne {
	public void checkAccessbility() {
		DemoOne demo=new DemoOne();
		demo.variableone=1;
		demo.variablethree=2;
		variableone=11;
	}
}
