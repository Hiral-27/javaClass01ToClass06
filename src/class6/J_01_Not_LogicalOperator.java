package class6;

public class J_01_Not_LogicalOperator {
    public static void main(String[] args) {
        /*
        NOT-  !
         it reverses the conditions. if something is true it will make it false
         and if something is false it will make it true.
         System.out.println(!true) => false

         */

        System.out.println(false);
        System.out.println(!false);
        boolean condition=!true;
        System.out.println(condition);

        String password="sjkbfskdf";
        System.out.println(password.equals("Pass123"));
        if(!password.equals("Pass123")){
            System.out.println("Wrong password");
        }

        boolean isRaining=true;

        if(!isRaining){
            System.out.println("lets go for a walk");
        }else {
            System.out.println("let take the umbrella");
        }
    }
}
