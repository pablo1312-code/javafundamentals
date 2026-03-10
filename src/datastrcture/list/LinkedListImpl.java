package datastrcture.list;
/**
 * 
 * @author panblo
 * 10 mar 2026
 */

public class LinkedListImpl <T> implements List <T>{
	
	private Node<T> first;
	private Node<T> last;
	
	@Override
	public void add(T data) {
		//1 create a new node
		Node<T> newNode = new Node<T>(data);
		//2 add the new node to the list 
//		System.out.println(first);
//		System.out.println(last);
//		System.out.println(newNode);
		//2.1 if the list is empty 
		if(first== null) {
			//point to the new node with the first and last
			first = last = newNode;
		}
		//2.1 if the list is not empty, add the new node to the end of the list
		else {
			//set the next of the last to the new node 
			last.setNext(newNode);
			//set the last node to the new node 
			last = newNode;
		}
		
	}

	
	@Override
	public void clear() {

    }
	@Override
	public void printlist() {
		
	 }

	@Override
	public T removelast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public T removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

}
