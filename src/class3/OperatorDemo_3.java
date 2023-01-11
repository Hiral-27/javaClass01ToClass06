package class3;

public class OperatorDemo_3 {
    public static void main(String[] args) {
        //**** Modulus(%) Operator
        int number=10;
        System.out.println(number/3); // Denominator
        System.out.println(number%3); // Remainder

        float number1=20;
        System.out.println(number1/3); // Denominator answer we will get in decimal
        System.out.println(number1%3); // Remainder
        System.out.println(16%2);

        System.out.println(156%2); // To find even number, answer is 0
        System.out.println(155%2); // Odd number, answer is not 0
        System.out.println(1655%15); // If answer is not 0, It's not divisible by 15
        System.out.println(1555%5); // If answer is 0, It's divisible by 5

    }
}
