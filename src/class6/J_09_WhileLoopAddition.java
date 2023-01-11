package class6;

public class J_09_WhileLoopAddition {
    public static void main(String[] args) {
        int number= 1;
        int sum= 0;
        while (number<= 5){
            sum= sum+ number;
            number++;
            System.out.println(sum);
        }
        System.out.println(sum); // To get the total final answer print it out of the loop

    }
}
