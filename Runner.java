/************************************************************************
 *  In this code for linked list int 30 is inserted between 70 and 56
 *  
 *  @author Pratik Chaudhari
 *  @since 25/06/2021
 ************************************************************************/
package com.bridgelabz;

public class Runner {
	public static void main(String[] args) {
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.add(56);
		numberList.add(70);
		numberList.addAtIndex(30, 1);
		numberList.show();
	}
}
