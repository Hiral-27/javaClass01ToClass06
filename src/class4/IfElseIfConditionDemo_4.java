package class4;

public class IfElseIfConditionDemo_4 {
    public static void main(String[] args) {
        /*
        If number1= number2 print Numbers are equal
        if number1>number2 print Number1 is greater than number2
        if number2>number1 print Number2 is greater than number1
         */
        int number1= 10;
        int number2= 10;
        if(number1==number2){
            System.out.println("Numbers are equal");
        } else if (number1>number2) {
            System.out.println(number1+" is greater than "+number2);
        } else if (number2>number1) {
            System.out.println(number2+ " is greater than "+number1);
        }else{
            System.out.println("Nothing");
        }

    }
}
