package class7;

public class classTask_01ForLoopOddNum {
    public static void main(String[] args) {
        // Question: Use for loop and print odd numbers from 1 to 20
        System.out.println("Method 1");
        for(int number=1; number<=20; number+=2){
            System.out.print(number+" ");
        }

        System.out.println();
        System.out.println("Method 2");
        for(int i=1; i<=20; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }



    }
}
