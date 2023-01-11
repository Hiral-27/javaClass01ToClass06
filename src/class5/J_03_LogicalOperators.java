package class5;

public class J_03_LogicalOperators {
    public static void main(String[] args) {

        double mathScore= 92.5;
        double historyScore= 91.5;
        double scienceScore= 93.5;

        if(mathScore>90 && historyScore>90 && scienceScore>90){
            System.out.println("You are Brilliant student");
        }else {
            System.out.println("You need to work hard");
        }

        boolean isTrue=false;
        boolean condition=!isTrue;
        System.out.println(condition);

        if(condition){
            System.out.println(" You got it");
        }else {
            System.out.println("Need more practice");
        }
    }
}
