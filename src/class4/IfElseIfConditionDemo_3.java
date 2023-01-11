package class4;

public class IfElseIfConditionDemo_3 {
    public static void main(String[] args) {

        // If-Else
        int month=1;
        if(month==1){
            System.out.println("January");
        }else {
            System.out.println("Some other day than January");
        }

        // If- Else- If
        int day=9;
        if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        } else if (day==3) {
            System.out.println("Wednesday");;
        } else if(day==4){
            System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong Day Number");
        }


    }
}
