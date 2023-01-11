package class6;

public class J_05_IncrementalOperator {
    public static void main(String[] args) {
        int number=10;
        number= number+ 1;
        System.out.println(number);   // Output- 11

        number+= 1;
        System.out.println(number);    //  Output- 12

        number++; // also increments the number by 1
        System.out.println(number);   //  Output- 13

        int number2= 10;
        number2--;   // decrement
        System.out.println(number2);   //Output- 9

    }
}
