package datastrcture.list;
/**
 * 
 * @author panblo
 * 10 mar 2026
 */

public class LinkedListImpl <T> implements List <T>{
	
	//used to point to the first node of the list, so we can go to the next node from the first node 
	//using the 'first.next'property
	private Node<T> first;
	/**
	 * this reference to the last node allows us add new nodes as well as direct 
	 * access to the last node effectively
	 */
	
	private Node<T> last;
	/**
	 * number of the elements 
	 */
	
	private int size; 
	
	@Override
	public void add(T data) {
		System.out.println("size = " + size);
		//1 create a new node
		Node<T> newNode = new Node<T>(data);
		//2 add the new node to the list 
//		System.out.println(first);
//		System.out.println(last);
//		System.out.println(newNode);
		size = size + 1;
		//size++; 
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
		first = null;
		last = null;
		size = 0;
		

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
	
	



public void add(Node<T> node) throws Exception {
    //1 check the parameter if it is valid
    if(node == null) {
        throw new Exception("You can not pass a null node to the list");
        
        
       
    }
    //2 add the node to the tail of the list
    //2.1 Check first if the head element is null,
    // in the case of null, it means the list is empty
    if(first == null) {//if the list is empty
        //the list is empty
        last = node;
        first = node;
    }
    else {
        last = node;
    }
}
} 
    

