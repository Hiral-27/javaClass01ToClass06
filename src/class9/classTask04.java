package class9;

public class classTask04 {
    public static void main(String[] args) {
        /*
         2) Create an array and store 10, 20, 30, 4 ,5,6,7,80 add all the elements which are multiple of 2
         */

        int[] num={10, 20, 30, 4, 5, 6 ,7, 80};
        int add= 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2==0) {
                System.out.println("Multiple of 2: " + i);
                add += num[i];
            }
        }
        System.out.println(add);
    }
}
