package class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName= "George";
        String lastName= "Michael";
        System.out.println("First Name= " +firstName);
        System.out.println("Last Name= " +lastName);
        System.out.println(firstName+lastName);// This is called as String concatenation.
        System.out.println(firstName+" "+lastName);// with space

        /* Java executes code from 'Top to Bottom' but if you hae multiple operations like below on the
           same line it executes from 'Left to Right' */
        System.out.println("***"+firstName+" "+lastName+"***");
        System.out.println("10"+"10");

        // Combine Numbers with String
        System.out.println(firstName+10);
        System.out.println(firstName+10.5);
        // Combine boolean with String
        System.out.println(firstName+true);

    }
}
