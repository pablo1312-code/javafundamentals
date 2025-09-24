package datastrcture;

import java.lang.foreign.ValueLayout.OfBoolean;
import java.net.Authenticator;
import java.util.Random;

import oopmodeling.Planet;

public class Arraytest {

	public static void main(String[] args) {

		sumup();
		sumup();
		//Create an array with a capacity of storing 10000 integers 
		int[] nums = new int[10000];
		initializeArray(nums);
		
		findMaxMin(nums);
		
		while(true) {
			break;
		}
		String[] names = { "Pablo", "Exel" };

		Planet[] planets = { new Planet(), new Planet() };

		System.out.println(names[1]);

		System.out.println(names[1]);
	}
	/**
	 * This method is used to find the maximum and minimum values
	 * 	contained in an array passed as parameter and print them
	 * @param nums
	 */
	
	

	private static void findMaxMin(int[] nums) {
		// TODO Auto-generated method stub
		int maximum = nums[0];
		int minimum = nums[0];
		for (int i=0; i<nums.length; i++) {
			/** 
			 * If the current maximum is less than the element 
			 * that we are accesing, we change the maximum to
			 * the value of the element 
			 */
			if(maximum<nums[i])
				maximum=nums[i];
			
			if(minimum>nums[i]) {
				minimum=nums[i];
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
