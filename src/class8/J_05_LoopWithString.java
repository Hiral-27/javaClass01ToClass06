package class8;

import java.util.Scanner;

public class J_05_LoopWithString {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        while(scanner.next().equalsIgnoreCase("Krishna")){
            System.out.println("Great student who always wanted an example with Stirng in loop");
        }
    }
}
