package com.ashish.programs;

import java.util.Arrays;

public class ComparableExample /*implements Comparable<ComparableExample>*/ {
	
	private String fruitName;
	private String fruitDesc;
	private int quantity;
	
	public ComparableExample (String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}
	
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int compareTo(ComparableExample compareFruit) {
	
		int compareQuantity = ((ComparableExample) compareFruit).getQuantity(); 
		
		//ascending order
		return this.quantity - compareQuantity;
		
		//descending order
		//return compareQuantity - this.quantity;
		
	}
	
	public static void main(String args[]) {

		ComparableExample[] fruits = new ComparableExample[4];
		
		ComparableExample pineappale = new ComparableExample ("Pineapple", "Pineapple description",70); 
		ComparableExample apple = new ComparableExample ("Apple", "Apple description",100); 
		ComparableExample orange = new ComparableExample ("Orange", "Orange description",80); 
		ComparableExample banana = new ComparableExample ("Banana", "Banana description",90); 
		
		int i = pineappale.compareTo(apple);
		System.out.println("i: " + i);
		
	}
}