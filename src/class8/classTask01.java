package class8;

public class classTask01 {
    public static void main(String[] args) {
        boolean summer = true;
     //  int temp = 75;

 /*       while (summer) {
            if (temp <= 100) {
                System.out.println("I love summer " + temp);
            } else {
                summer= false;
                System.out.println("It's very hot");
            }
            temp += 5;
        }
*/
        for(int temp=75; temp<=100; temp+=5){
            if(temp<=100){
                System.out.println("I love summer " + temp);
            } else {
                System.out.println("It's very hot"+ temp);
            }
        }
    }
}
