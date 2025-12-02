package datastrcture;
/*
This is a class that represents an extensible array.
An array has a fixed capacity, when reaching the end
of the array, we have to expand itautomatically.
 */

public class FlexibleArray<E>{
    //An array with fixed size
    private E[] elements;
    private static final int INITIAL_CAPACITY = 5;
    // The variable to store how many element we have added to the array
    private int size = 0;
    
    private static int EXPANSION_FACTOR = 40;

    /**
     * we use this contructor to create an array when we know
     * how many elements to store in the array
     * @param size
     */
    public FlexibleArray(int size){
    	if(size<= 0) {
    		size = INITIAL_CAPACITY;
    	}
    	// create a array of objects
        elements = (E[]) new Object[size];
    }
    /**
     * Use this contructor to create an array with a default capacity
     */
    public FlexibleArray(){
    	
        elements = (E[]) new Object[INITIAL_CAPACITY];

    }

    /**
     * Add an element to the array at its last position
     * @param e
     */

    public void add(E element) {
        //PASO 0: Check if we have reached to the las position
        //if tru,we have to expand the capacity of the array
    	if(size == elements.length) {
    		//The array iss full, we have to extend its capacity
    		//firt we create a new array with a mayor capacity
    		E[] newArr = (E[]) new Object[elements.length + EXPANSION_FACTOR];
    		//copy the elements from the old array to the new one
    		//newArr[0] = elements[0]
    		//newArr[1] = elements[1]
    		for (int i = 0; i < elements.length; i++) {
    		    newArr[i] = elements[i];
    		}
    		elements = newArr;
    	}	
        //PASO 1:Add the element to the last positions of the array
    	elements[size] = element;
    	size ++;
    }

    /**
     * Remove the element at position "i"
     * @param i
     */
    public void remove(int i) {
    	//step 1: eliminate the element at position passed by the parameter
    	elements[i] = null;
//    	elements[i] = elements[i+1];
//    	elements[i+1] = elements[i+2];
//    	elements[i+2] = elements[i+3];
//    	elements[i+3] = elements[i+4];
    	//...
        //size - i - 1 is the number of elements that we have to move 
    	for (int j = 0; j < elements.length; j++) {
    		elements[i+j] = elements[i+j+1];
		}
    	size --;
    	
    	
    }

    public int size() {
        return size;
    }
    
    public E get(int index) {
    	return elements[index];
    }
}
