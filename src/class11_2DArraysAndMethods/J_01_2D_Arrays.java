package class11;

import java.util.Arrays;

public class J_01_2D_Arrays {
    public static void main(String[] args) {
        int[][] matrix= {{10,20,30},        // Row 0
                        {45,55,66},         // Row 1
                        {30,40,20,10,25}};  // Row 2

        System.out.println(matrix[2][4]); // Output---> 25
        System.out.println(Arrays.toString(matrix[0])); // To print whole 1st row
        for(int i=0; i<matrix[1].length; i++){
            System.out.println(matrix[1][i]); // To print Row 1
        }
        System.out.println("***********");    // Method 2- to print Row 0
        int arr[] = matrix[0]; // Getting whole first array from 2D array
        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("************");  // Getting whole last array from 2D Array Row 2
        int num[]= matrix[2];
        for(int i=0; i< num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
