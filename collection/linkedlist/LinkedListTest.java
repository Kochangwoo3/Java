package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// LinkedList Test하기
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
			
		myList.add(1, "D");  
		//맨앞에
		myList.addFirst("O");  // O, A, D, B, C
		System.out.println(myList);
		
		myList.removeLast();
		System.out.println(myList);  // O, A, D, B
		
		
	}

}
