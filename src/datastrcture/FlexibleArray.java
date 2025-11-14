package datastrcture;

/**
*This is a class that represent an extensible array.
*An array has a fixed capacity, when reaching the end
*of the array, we have to expand it.
 */

public class FlexibleArray<T> {
    /*
    We use this constructor to create an array when
    we know how many elements to store in the array
     */
    //An array with fixed size
    private T[] elements ;
    private final int INITIAL_CAPACITY = 5;
    public FlexibleArray(int size) { elements = (T[]) new Object[INITIAL_CAPACITY]; }

    /*
     Use this constructor to create an array with a default capacity
     */
    public FlexibleArray() { elements = (T[]) new Object[INITIAL_CAPACITY]; }

    /**
     *Add an element to the array at its last position
     * @param e
     */

    public void add(T e) {
        //paso 1: add the element to the last position of the array
        //paso 2:
    }

    public T size() {
    }


    public void remove(T i) {
    }


}
