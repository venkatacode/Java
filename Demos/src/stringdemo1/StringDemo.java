package stringdemo1;

public class StringDemo {
	
		private String customerName;
		private int applicableDiscount;
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public int getApplicableDiscount() {
			return applicableDiscount;
		}
		public void setApplicableDiscount(int applicableDiscount) {
			this.applicableDiscount = applicableDiscount;
		}
		
		public void findDiscountAndName(String inputString) {
			
			//write the solution as mentioned 
			String[] parts=inputString.split(":");
			if(parts.length==2){
			String customerType=parts[0].trim();
			customerName=parts[1].trim();
		
		if(customerType.equalsIgnoreCase("Regular")){
		applicableDiscount=10;
	}
	else if(customerType.equalsIgnoreCase("Privileged")){
	      applicableDiscount=20;}
	      }
	      }
	      }


	class Tester{
		public static void main(String[] args) {
			StringDemo customer1 = new StringDemo();  //regular
			StringDemo customer2 = new StringDemo(); //privileged
			String input1="Regular:      Jack  ";
			String input2="Privileged:   Mary  ";
			customer1.findDiscountAndName(input1);
//			System.out.println(customer1.getCustomerName());
			System.out.println("Hi"+customer1.getCustomerName()+" "+customer1.getApplicableDiscount()+"% is applicable for you");
			customer2.findDiscountAndName(input2);
			System.out.println("Hi"+customer2.getCustomerName()+" "+customer2.getApplicableDiscount()+"% is applicable for you");
			//write the code to implement the solution
		
		}
	}

