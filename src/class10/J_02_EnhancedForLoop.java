package class10;

public class J_02_EnhancedForLoop {
    public static void main(String[] args) {
        /*   Syntax Enhanced for Loop
        for(datatype variable:  arrayname){
        System.out.println(variable);
         */
        int[] arr={10,20,30,40,50};
        for(int number: arr){
            System.out.println(number);
        }
    }
}
