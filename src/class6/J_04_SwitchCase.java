package class6;

import java.util.Scanner;

public class J_04_SwitchCase {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter Country: ");
        String country= input.next();

        // System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){ // converts the text to lowercase USA=>usa

            case "usa":
                System.out.println("Burgers");
                break;
            case "itlay":
                System.out.println("Pasta");
                break;
            case "afghanishtan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");

        }
    }
}
