package class10;

public class J_04_ForEachLoop {
    public static void main(String[] args) {
        // Enhanced Loop also known as "ForEachLoop"
        int [] num= {10,13,20,25,45,50};
/*
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                System.out.println("Odd Numbers: "+arr[i]);
            }
        } */

        for (int i = 0; i < num.length; i++) {
            if(num[i]%2!=0){
                num[i]=0;    // Reassigning odd number to 0
            }
        }
        System.out.println("Replacing all odd number to 0 ");
        for(int i=0; i< num.length;i++){
            System.out.println(num[i]);
        }
    }
}
