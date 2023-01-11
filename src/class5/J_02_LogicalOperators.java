package class5;

public class J_02_LogicalOperators {
    public static void main(String[] args) {
/*
     Logical operators: Just another set of symbols that we can use to continue multiple boolean value
     There are 3 logical operators:    !(not)     ||(or)       &&(and)
 */


        // Example 1: Logical Operator=>  Not
        System.out.println(!true); // output=> false
        System.out.println(!false); // output=> true


        //Example 2:  Logical Operator=>  And
        // Print Number 9
        int number=9;
                if(number>9 && number<9){
                    System.out.println("Hello Java");
                }else {
                    System.out.println("Number 9");
                }


        //Example 3:   Logical Operator=>  Not
                String country= "China";
                if(!country.equalsIgnoreCase("Bad country")){
                    System.out.println("You are Welcome");
                }




    }
}
