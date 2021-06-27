/************************************************************************
 *  In this code for linked list, pop method is executed.
 *  
 *  @author Pratik Chaudhari
 *  @since 25/06/2021
 ************************************************************************/
package com.bridgelabz;

public class Runner {
	public static void main(String[] args) {
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(70);
		System.out.println("Array before pop");
		numberList.show();
		System.out.println();
		numberList.pop();
		System.out.println("Array after pop");
		numberList.show();
	}
}
