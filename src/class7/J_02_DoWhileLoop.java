package class7;

import java.util.Scanner;

public class J_02_DoWhileLoop {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // do while loop
        System.out.println("Method 1: Do While Loop");
        int num;     // To access the variable it should be always declared outside the 'do'
        do{
            System.out.println("Please Enter a number");
            num= input.nextInt();
        }while(num!=5);


        // while loop
        System.out.println("Method 2: While Loop");
        int num1=0;
        while(num1!=5){
            System.out.println("Please Enter a number");
            num1= input.nextInt();
        }
    }
}
