package class3;

public class RelationalOperators_6 {
    public static void main(String[] args) {
        /* Arithmetic Operators gives answer in the same Datatype, example below int
        int + int= int
        int-int= int
        int/int= int
        int * int= int
         */
        int number1= 10;
        int number2= 20;
        System.out.println(number1+number2);

        /*
        Relational Operators
        int < int---> answer boolean
        == equal tp
        != not equal to
        > greater than
        < less than
        >= greater or equal
        <= less or equal
         */
        boolean result= 20>10;
        System.out.println(result);

        System.out.println(20<10); // is 20 smaller than 10--> Output false
        System.out.println(5>10); // is 5 greater than 10--> Output false

        System.out.println(5!=10); // is 5 not equal to 10--> Output true
        System.out.println(5==10); // is 5 equal to 10--> Output false
        System.out.println(5==5); // is 5 equal to 10--> Output true

        System.out.println(10<=20); // is 10 less than or equal to 20--> Output true
        System.out.println(10>=20); // is 10 greater than or equal to 20--> Output false
        System.out.println(10<=10); // is 10 less than or equal to 10--> Output true






    }
}
