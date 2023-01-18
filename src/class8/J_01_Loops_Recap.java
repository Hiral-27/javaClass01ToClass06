package class8;

public class J_01_Loops_Recap {
    public static void main(String[] args) {
        // Question:   Print 10 8 6 4 2

        // Do While Loop
        System.out.println("Do While Loop");
        int number = 10;
        do{
            System.out.println(number);
            number-=2;
        }while(number>=2);
        System.out.println();


        // While
        System.out.println("While Loop");
        int num=10;
        while(num>=2){
            System.out.println(num);
            num-=2;
        }
        System.out.println();


        // For Loop
        System.out.println("For Loop");
        for(int i= 10; i>=2; i-=2){
            System.out.println(i);
        }
    }
}
