package class6;

public class J_03_And_LogicalOperator {
    public static void main(String[] args) {
        /*
        And  &&
        it can also combine two or more conditions. it only returns true if all the
       conditions are true.
         */
        boolean understandJava= false;
        boolean enjoyJava= false;

        if(understandJava && enjoyJava){
            System.out.println("You get the Job Quickly");
        }else {
            System.out.println("We need to work hard");
        }

    }
}
