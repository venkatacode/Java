package com.infy.listandgenerics;
import java.util.ArrayList;
import java.util.List;

import com.infy.genericarraylist.methods.Student;

public class Order {
	
	
	    private int orderId;
	    private List<String> itemNames;
	    private boolean cashOnDelivery;
	    
	    public Order(int orderId, List<String> itemNames, boolean cashOnDelivery) {
	    	this.orderId = orderId;
	    	this.itemNames = itemNames;
	    	this.cashOnDelivery = cashOnDelivery;
	    }
	    
		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public List<String> getItemNames() {
			return itemNames;
		}

		public void setItemNames(List<String> itemNames) {
			this.itemNames = itemNames;
		}

		public boolean isCashOnDelivery() {
			return cashOnDelivery;
		}

		public void setCashOnDelivery(boolean cashOnDelivery) {
			this.cashOnDelivery = cashOnDelivery;
		}
	    
	}

	class Test {
		public static void main(String[] args) {
			List<Order> orderList1 = new ArrayList<>();
			
			List<String> items1 = new ArrayList<>();
			items1.add("FriedRice");
			items1.add("Pasta");
			items1.add("Thortilla");
			orderList1.add(new Order(101,items1,true));
			List<Order> orderList2 = new ArrayList<>();
			List<String> items2 = new ArrayList<>();
			items2.add("Pizza");
			items2.add("Pasta");
			orderList2.add(new Order(102,items2,true));
			List<Order> orderList3 = new ArrayList<>();
			List<String> items3 = new ArrayList<>();
			items3.add("Burger");
			items3.add("Sandwich");
			items3.add("Pizza");
			orderList3.add(new Order(103,items3,true));
			System.out.println("Displaying Order Details");
			//Code here
			for (Order order:orderList1) {

				System.out.println("\nOrder Id: " + order.getOrderId());
				System.out.println(""+items1);
				
				}
			for (Order order:orderList2) {
//				
				System.out.println("\nOrder Id: " + order.getOrderId());
				System.out.println(""+items2);
	
			}
			for (Order order:orderList3) {
//			
				System.out.println("\nOrder Id: " + order.getOrderId());
				System.out.println(""+items3);
		}
	}
	}



