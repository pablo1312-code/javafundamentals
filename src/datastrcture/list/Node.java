package datastrcture.list;

public class Node<T> {

	private Node<T> next;
	
	public Node( T t) {
		
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getDataT() {
		return dataT;
	}

	public void setDataT(T dataT) {
		this.dataT = dataT;
	}

	private T dataT;
}
