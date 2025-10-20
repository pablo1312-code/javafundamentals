package datastrcture;

import java.util.Arrays;

public class MultiDimensionalArrayTest {
    public static void main(String[] args) {
        int rows = 10;
        int columns = 30;
        int[][] world = new int[rows][columns];
        int[][] numbers =
                {
                        {1, 2, 3},
                        {123, 231, 453},
                        {899, 667, 800},
                        {23, 5, 56}
                };

        int[] arr = {2, 2356, 234, 2};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j] + " ");
                for (j = 0; j < numbers[i].length; j++) {
                    System.out.print(numbers[i][j] + " ");

                }
                System.out.println();
            }


        }
        for(int i = 0; i< rows; i++) {
            for(int j = 0; j< columns; j++) {
                world[i][j]= 1;
            }
        }

        for(int i= 0; i<rows; i++) {
            for(int j= 0; j <columns; j++) {
                System.out.print(world [i][j] + " ");
            }
            System.out.println();
        }

        int depth = 3;
        int[][][] MinecraftWorld = new int [rows][columns][depth];
        for(int i = 0; i< MinecraftWorld.length; i++) {
            for (int j = 0; j <MinecraftWorld[i].length; j++) {
                for(int k = 0; k<MinecraftWorld[i][j].length; k++) {//depth
                    MinecraftWorld[i][j][k] = i + j + k;

                }
            }
        }

        System.out.println(MinecraftWorld[0][0][0]);
        System.out.println(MinecraftWorld[4][4][2]);
    }
}
