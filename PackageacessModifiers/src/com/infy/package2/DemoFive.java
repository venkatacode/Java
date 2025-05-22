package com.infy.package2;
import com.infy.package1.DemoOne;

public class DemoFive {
public void checkAccessbility() {
	DemoOne demo=new DemoOne();
		//demo.variableone=1;
//	You can observe that you get a compilation error stating 'The field DemoOne.variableOne is not visible' while trying to access variableOne of class DemoOne in the class DemoFive as variableOne is protected and hence, can be accessed only within the same package in which it is defined or in child classes of a different package.
	}
}
