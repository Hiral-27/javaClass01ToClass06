package class6;

import java.util.Scanner;

public class J_02_OR_LogicalOperators {
    public static void main(String[] args) {
        /*
        OR-  ||
        It can combine 2 or more conditions and return true as long as 1 condition is true. True || False---> true
        if all conditions are false then it will return false.  False || False----> false
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the day: ");
        String day= input.next();
        if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")){
            System.out.println("No class today");
        }else if (day.equalsIgnoreCase("Wednesday")|| day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Manual Testing class");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Review class");
        }else {
            System.out.println("Wrong day entered");
        }
    }
}
