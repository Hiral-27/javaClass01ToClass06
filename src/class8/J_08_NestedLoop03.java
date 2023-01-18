package class8;

public class J_08_NestedLoop03 {
    public static void main(String[] args) {
        for(int i=0; i<3; i++){
            if(i==1){
                System.out.println();
                continue;
            }
            for(int j=0; j< 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
