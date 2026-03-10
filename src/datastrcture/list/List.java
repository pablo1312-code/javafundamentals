package datastrcture.list;
/**
 * Development oriented to interface:
 * what is an interface in programming?
 * @author panblo
 * 4 mar 2026
 */
public interface List<E> {
	
	
	/**
	 * add an element to the list 
	 * @param e 
	 */
	public void add(E e);
	/**
	 * remove the last element in the list 
	 * @return
	 */
	public E removelast(); 
	/**
	 * Remove all the elements in the list 
	 */
	public void clear();
	
	/**
	 * Print all the elements in the list 
	 */
	public void printList();
	E removeLast();
	void printlist();

	
}
