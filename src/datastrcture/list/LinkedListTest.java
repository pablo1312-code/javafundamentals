package datastrcture.list;

import oopmodeling.Planet;
import oopmodeling.main;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		
		Node<Integer> first = new Node<Integer>(10);
		Node<Integer> second = new Node<Integer>(122);
		Node<Integer> third = new Node<Integer>(111);
		Node<Integer> fourth = new Node<Integer>(2133);
		first.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		
		LinkedListImpl<Integer> list = new LinkedListImpl<>();
		list.add(12);
		list.add(333);
		list.add(20);
		list.add(320);
	}

}
