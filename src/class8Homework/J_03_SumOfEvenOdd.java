package class8Homework;

import java.util.Scanner;

public class J_03_ {
    public static void main(String[] args) {
        /*
        Write a program that reads a range of integers (start and end point), provided by a user and then from
        that range prints the sum of the even and odd integers.
         */

        Scanner input=new Scanner(System.in);
        String quit;
        do {
            System.out.println("Enter start number: ");
            int number1 = input.nextInt();
            System.out.println("Enter end number: ");
            int number2 = input.nextInt();

            if (number1 % 2 == 0  && number2 % 2 == 0) {   // Number 1 and Number 2 Both Even
                int sumEven = number1 + number2;
                System.out.println(number1 + " and " + number2 + " are Even Numbers and sum of Even num is " + sumEven);
            } else if (number1 % 2 != 0 && number2 % 2 != 0) {     // Number 1 and Number 2  Both Odd
                int sumOdd = number1 + number2;
                System.out.println(number1 + " and " + number2 + " are Odd Number and sum of Odd num is " + sumOdd);
            } else if (number1 % 2 == 0) {   // Number 1 is even,  Number 2--? ODD
                System.out.println(number1 + " is an Even Number and " + number2 + " is an Odd Number. The sum of both number: "+(number1+number2));
                System.out.println("The sum of Even number is "+number1);
                System.out.println("The sum of Odd number is "+number2);
            } else if (number1 % 2 != 0) {  // Number 1 is odd, Number 2---? EVEN
                System.out.println(number1 + " is an Odd Number and " + number2 + " is an Even Number");
                System.out.println("The sum of Odd number is "+number2);
                System.out.println("The sum of Even Number is "+number1);
            } else {
                System.out.println("Invalid Input");
            }

            System.out.println("Do you want to quit? ");
            quit= input.next();

            if(quit.equalsIgnoreCase("yes")){
                System.out.println("Thank You!!");

            }
        }while(quit.equalsIgnoreCase("No"));

    }
}
