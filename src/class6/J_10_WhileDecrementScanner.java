package class6;

public class J_10_WhileDecrementScanner {
    public static void main(String[] args) {

    /*    int num=1;
        int sum=0;
        while (num<=10){
            sum= sum+num;
            num++;
            System.out.println(sum);
        } */

        int number1= 1;
        boolean flag= true;
        while(flag) {
            System.out.println(number1);
            if(number1> 3){
                flag= false;
            }
            number1++;
        }
    }
}
