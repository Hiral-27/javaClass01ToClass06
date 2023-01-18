package class9;

public class J_03_ArraysInteger {
    public static void main(String[] args) {
        int[] number= {10, 20, 30, 45, 50};
        int sum=0;
        for(int i=0; i< number.length;i++){
            System.out.println(number[i]);
            sum+= number[i];
        }
        System.out.println(sum);




    }
}
