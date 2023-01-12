package class7;

public class J_04_ForLoop {
    public static void main(String[] args) {
        // Question Print number from 0 to 9
        System.out.println("Method 1: While Loop");
        int number= 0;
        while(number<=9){
            System.out.println(number);
            number++;
        }

//----------------------------------------------------------------------------------------------------------
        System.out.println("Method 2: For Loop");
        for(int i=0; i<10; i++){
            System.out.println(i);
        }

    }
}
