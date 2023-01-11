package class5;

import java.util.Scanner;

public class J_01_ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        /*
        Scanner => Name of the class
        scan is just a variable like we create primitive variable
        = is an assignment operator
        System.in  => tells the computer we want to read the data from the keyboard
         */
/*
        System.out.println("Please Enter your age: ");
        int age= scan.nextInt();
        System.out.println("You are "+age+" years old");

        System.out.println("Please Enter your weight: ");
        double weight= scan.nextDouble();
        System.out.println("Your weight is "+weight);
*/
        System.out.println("Are you Hungry?");
        boolean hungry= scan.nextBoolean();
        System.out.println("Hungry " +hungry);

        System.out.println("Please Enter your Gender: ");  // Male  M=0, a=1, l=2, e=3
        char gender= scan.next().charAt(0);   // Here if charAt(2); then
        System.out.println("Your gender is "+gender); // Output will be l

        System.out.println("Please Enter your name: ");
        String name= scan.next();  // it will take only one word as the input
        System.out.println("Your name is "+name);

        System.out.println("Please Enter your Full name: ");
        String fullname= scan.nextLine();
        System.out.println("Your full name is "+fullname);

        scan.close();




    }
}
