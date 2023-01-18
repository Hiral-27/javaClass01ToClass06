package class10;

import java.util.Arrays;
import java.util.Scanner;

public class J_07_Arrays {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] numbers= new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter values");
            numbers[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));   // To print all the elements in the Array




    }
}
