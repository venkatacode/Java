package com.infy.lamba;

	class CalculatorScenarioJosh implements Operation{

	    //Method taking the two numbers and the operation to be performed
	    public static double doOperation(double firstNum, double secondNum, Operation operator) {
		    return operator.opCriteria(firstNum, secondNum);
	    }
	    
	    public static void main(String[] args) {
			
			//Lambda Expression for Addition operation
		    Operation add = (x,y) -> x+y;
		    //Lambda Expression for Subtraction operation
		    Operation subtract = (x,y) -> x-y;
		    //Lambda Expression for Multiplication operation
		    Operation multiply = (x,y) -> x*y;
		    //Lambda Expression for Division operation
		    Operation divide = (x,y) -> x/y;
		    //Modulus
		    Operation mod=(x,y)->x%y;
		
		    //Change the values and operations (add,subtract,multiply and divide only)
		    System.out.println("Result is: "+doOperation(12, 4, mod));
	    }

		@Override
		public double opCriteria(double firstNum, double secondNum) {
			// TODO Auto-generated method stub
			return 0;
		}
	    
	}    

