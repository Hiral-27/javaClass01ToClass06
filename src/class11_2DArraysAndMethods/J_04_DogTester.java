package class11;

import java.util.Scanner;

public class J_04_DogTester {
    public static void main(String[] args) {
        // Creating an actual object from the class Scanner
        Scanner scanner= new Scanner(System.in);
        //  This is how we create the objects of a class

        J_03_Dog scooby= new J_03_Dog();
        scooby.bark();
        scooby.sleep();
        scooby.eat();
    }

}
