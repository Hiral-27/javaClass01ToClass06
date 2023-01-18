package class9;

public class J_04_Arrays {
    public static void main(String[] args) {
        int number= 10;
        int[] numbers = new int[5];  // An empty array of size 5, you can store 5 values to it
        numbers[0]= 50;
        numbers[1]= 30;
        numbers[2]= 55;
        numbers[3]= 60;
        numbers[4]= 52;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
