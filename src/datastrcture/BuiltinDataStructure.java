package datastrcture;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

import oopmodeling.Planet;

public class BuiltinDataStructure {
	
	public static void main(String[] args) {
		//Create two objects of a class {@link Planet}
		Planet planet1 = new Planet();
		Planet planet2 = new Planet(123,"Mars");
		//create an object of array with a fixed size of 5 
		Planet[] pls = new Planet[5];
		pls[0] = planet1;
		pls[1] = planet2;
		//create an object of class{@link ArrayList}
		ArrayList<Planet>planets =new ArrayList<>();
		//add an object to position 0 
		planets.add(planet1);
		//add an object to position 1
		planets.add(planet2);
		//retrive the value at index 1
		planets.get(1);
		//create an object of class{@link ArrayList} and add some object of String 
		
		LinkedList<String> names = new LinkedList<>();
		names.add("Pablo");
		names.add("Justo");
		//less efficient than accessing elements in an Array when using index
		names.get(1);
		//last in first out 
		Stack<Integer> callstack = new Stack<>();
		//add an element on the top of the stack object
		callstack.push(34);
		callstack.push(10);
		callstack.push(2);
		//peek method is used to read the element on the top of the stack without eliminating it 
		System.out.println(callstack.peek());
		//remove the element from the top of the stack 
		System.out.println(callstack.pop());
		System.out.println(callstack.peek());
		//first in  first out 
		Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		queue.add(123);
		queue.add(13);
		queue.add(12300);
		//poll Retrieves and removes the head of this queue, or returns null if this queue is empty.
		System.out.println(queue.poll());
		
	}

}
