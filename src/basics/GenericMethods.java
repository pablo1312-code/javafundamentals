package basics;

import java.util.Arrays;

public class GenericMethods {
	
	public static void main(String[] args) {
		String[] names= {"Pablo", "Juan", "Ana", "Justo"};
		Integer[] scores= {12000, 1000, 290, 34, 49, 90, 84, 345}; 
		switchValues(names,0, 1);
		switchValues(scores, 0, 1);
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(scores));

}
	
/**
 * 
 * We can create generic methods to reach the maximum responsability of the code of a method 
 * @param <T> The name of the generic type 
 * @param arr
 * @param index1
 * @param index2
 */
public static<T> void switchValues(T[] arr, int index1, int index2) {
		
		if (arr==null) {
			return;
		}
		//"||"this is operator "or" used to add multiple parallel conditions
		//if one of the conditions is true, the statement inside the if body 
		//will be executed 
		if(index1< 0 || index2< 0) {
			return;
		}
		//>= means greater or equal
		//The index of the last element in an array is arr.length -1
		if(index1 >= arr.length || index2 >= arr.length) {
			return;
			
		}
		T dato = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = dato;
} 
}
