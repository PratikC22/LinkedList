/************************************************************************
 *  In this code a simple linked list of integers is created, with 3 
 *  int 56,30,40,70 and 40 is deleted.
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
		numberList.add(40);
		numberList.add(70);
		System.out.println("Linked list elements");
		numberList.show();
		System.out.println();
		int searchResult = numberList.searchByValue(40);
		numberList.popAtIndex(searchResult);
		numberList.show();
		System.out.println("The size of the list is " + numberList.size());
	}
}
