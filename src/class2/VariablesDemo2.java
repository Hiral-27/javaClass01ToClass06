package class2;

public class VariablesDemo2 {
    public static void main(String[] args) {
        // Re-declaring Or Re-assigning Or Overwriting the Datatype
        int numberBox= 10;
        numberBox= 20; //you don't have to declare datatype 'int' again, its saved once you have declared
        System.out.println(numberBox); // It will print 20 and not 10 coz it was re-assigned
        System.out.println(numberBox+30); //you can reuse the variable multiple times once declared

        // Loops
        int number= 20;
        System.out.println(number*1);

    }
}
