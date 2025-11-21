package datastrcture;

import java.lang.foreign.ValueLayout.OfBoolean;
import java.net.Authenticator;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;


import oopmodeling.Planet;

/**
 * 
 * @author panblo
 * 21 nov 2025
 */
public class Arraytest {

	private static void unaryOperatorsTest() {

	}

	public static void main(String[] args) {

		sumup();
		sumup();
		int[] scores = { 12, 34, 3423 };
		// Create an array with a capacity of storing 10000 integers
		// switch any two elements at two positions in an array
		switchValues(scores, 4, 10);
		switchValues(scores, 20, 45);
		switchValues(scores, 23, 5);
		switchValues(null, 23, 5);
		switchValues(scores, -23, -5);
		int[] nums = new int[10000];
		initializeArray(nums);

		findMaxMin(nums);

		while (true) {
			break;
		}

		
		incrementSalary();
		System.out.println(nums);
		int[] sliced = slice(nums,2, 45);
		System.out.println(Arrays.toString(sliced));
		
		System.out.println(scores);
		slice(scores, 2, 10);
		slice(scores,10,0);

	}
	
	/**
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	
	
	
	private static int[] slice(int[]arr,int start, int end) {
		
		 if(arr==null) {
			 return null;
		 }
		 if(start<0 || end < 0 || start >= arr.length || end >= arr.length) {
			 return null;	 
		 }
		 if(start>end) {
			 return null;	 
		 }
		System.out.println(arr);
		int[] result = new int[end-start+1];
		//result[0] = arr[start+ 0];
		//result[1] = arr[start+1];
		//result[2] = arr[start+2];
		for (int i= 0; i< result.length; i++) {
			result[i] = arr[start+ i];
			
		}
		
		return result;
	}
	
	/**
	 * Reverse the order of the elements in an array
	 * @param arr that we are going to reverse 
	 */
	
	
    private static void reverse(int[]arr) {
    	
    	int index1 = 0;
    	int index2 = arr.length -1;
    	
    	
    	for (int i= 0; i< arr.length / 2; i++) {
    		int element= arr[index1];
    		arr[index1] = arr[index2];
    		arr[index2] = element;
    		index1++;
    		index2--;
    	}
    	
    	System.out.println(Arrays.toString(arr));
    	index1= 0;
    	index2 = arr.length -1;
    	while (index1< index2) {
    		int element = arr[index1];
    		arr[index1] = arr[index2];
    		arr[index2] = element;
    		index1++;
    		index2--;
    	}
    }
	private static void incrementSalary() {
		float[] salaries = { 234.324f, 55.38f, 122.21f, 2901.45f };
		// {234.324f,55.38f,122.21f, 2901.45f};
		/**
		 * increment the value of the first data by stored in the array
		 */
		salaries[0] = salaries[0] + 10;
		System.out.println(salaries[0]);
		salaries[1] = salaries[1] + 10;
		salaries[2] = salaries[2] + 10;
		salaries[3] = salaries[3] + 10;
		// Automatizacion del proceso con bucles
		for (int i = 0; i < salaries.length; i++) {

		}
		String[] names = { "Pablo", "Exel" };

		Planet[] planets = { new Planet(), new Planet() };

		System.out.println(names[1]);

		System.out.println(names[1]);

		
	}

	public static void switchValues(int[] arr, int index1, int index2) {
		
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
		int dato = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = dato;

		
	}

	/**
	 * This method is used to find the maximum and minimum values contained in an
	 * array passed as parameter and print them
	 * 
	 * @param nums
	 */

	private static void findMaxMin(int[] nums) {
		// TODO Auto-generated method stub
		int maximum = nums[0];
		int minimum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			/**
			 * If the current maximum is less than the element that we are accesing, we
			 * change the maximum to the value of the element
			 */
			if (maximum < nums[i])
				maximum = nums[i];

			if (minimum > nums[i]) {
				minimum = nums[i];
			}
		}

	}

	private static void initializeArray(int[] nums) {
		// Create an array with a capacity of storing 10000 integers

		System.out.println("the length of the number array is" + nums.length);
		Random random = new Random();
		random.nextInt(-100000, 1000000);
		nums[0] = random.nextInt(-100000, 1000000);

		int len = nums.length;
		int j = 0;
		while (len > j) {
			nums[j] = random.nextInt(-100000, 1000000);
			j = j + 1;// This operation is the same as j++

		}

	}

	private static void sumup() {

		int[] scores = { 12, 54, 67 };

		System.out.println(scores[0]); // access to the first element in the array
		System.out.println(scores[1]); // retrieve the second element
		System.out.println(scores[2]);
		try {
			System.out.println(scores[3431]);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int total = scores[0] + scores[1] + scores[2];

		int totalscore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalscore = totalscore + scores[i];
			System.out.println("totalScore =" + totalscore);

		}

	}
}

// Clase dummy para que compile
