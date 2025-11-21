package datastrcture;

import java.util.Arrays;

public class SortingTest{
    public static void main(String[]Args) {
        String[] names= {"Pablo", "Juan", "Ana", "Justo"};
        int[] scores= {12000, 1000, 290, 34, 49, 90, 84, 345};
        sort(scores);
      boolean isExisting =  binarySearch(234,scores);

    isExisting =  linearSearching(234, scores);

    }

    /**
     * In this algorithm, we search a specific element in an ordered array by
     * comparing the element with the ones in the array one by one.
     * The time consumed in this algorithm is averagely proportional to
     * the size of the array.
     * @param element
     * @param elements
     * @return
     */
    private static boolean linearSearching(int element, int[] elements) {
        /**
         * Steps
         * 1 Create a loop to traverse the elements in the array
         * 2 In the body of the loop, we compare the element with
         * the elements of the array, if there is a match, we return
         * true
         */
        for(int i = 0; i < elements.length; i++) {
            if(elements[i] == element){
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(int element, int[] elements) {
        //1 Calculate the index of the middle element
        int startIndex = 0;
        int endIndex = elements.length;
        int middleIndex = (endIndex-startIndex) / 2;

        //2 If the middle element is equal to the element we are looking for, return the value
        if(elements[middleIndex] ==element){
        return true;
    }
        //2 If the current element in the array is greater, we check the left half
        else if(elements[middleIndex] > element){
            endIndex = middleIndex;
            middleIndex = (endIndex-startIndex) / 2;
        }

        }
        //2 If the current element in the array is smaller than the element,
        //we check the rigth half

    private static void sort(int[] arr) {

        int j= 0;

//		for (int i = 0; i< arr.length-1  -j; i++) {
//			int previous= arr[i];
//			int next = arr[i+1];
//			if(previous >next) {

//
//				Arraytest.switchValues(arr, i, i+1);
//				System.out.println(Arrays.toString(arr));
//			}
//		}
//		j++;

//		for (int i = 0; i< arr.length-1  -j; i++) {
//			int previous= arr[i];
//			int next = arr[i+1];
//			if(previous >next) {
//
//				Arraytest.switchValues(arr, i, i+1);
//				System.out.println(Arrays.toString(arr));
//			}
//		}
//		j++;
//		for (int i = 0; i< arr.length-1 -1 -j; i++) {
//			int previous= arr[i];
//			int next = arr[i+1];
//			if(previous >next) {
//
//				Arraytest.switchValues(arr, i, i+1);
//				System.out.println(Arrays.toString(arr));
//			}
//		}
//		j++;

        while(j< arr.length) {
            for (int i = 0; i< arr.length-1 -1 -j; i++) {
                int previous= arr[i];
                int next = arr[i+1];
                if(previous >next) {

                    Arraytest.switchValues(arr, i, i+1);
                    System.out.println(Arrays.toString(arr));
                }
            }
            j++;

        }
    }
}