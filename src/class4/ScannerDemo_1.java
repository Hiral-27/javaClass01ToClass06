package class4;

import java.util.Scanner;

public class ScannerDemo_1 {
    public static void main(String[] args) {

        //Below line helps us to get the input from the user
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name= input.nextLine();  // User inputs are stored in name variable
        System.out.println("My name is "+name);

        input.close();
    }
}
