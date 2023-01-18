package class8;

public class J_02_Break {

    // We can use break inside for loop, while loop do while loop
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Last line");
    }
}
