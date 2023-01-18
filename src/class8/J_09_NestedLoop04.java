package class8;

public class J_09_NestedLoop04 {
    public static void main(String[] args) {
    /*    for(int i=0; i< 3; i++){
            for(int j=1; j<=5; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        } */

        for(int i=0; i<3; i++){
            for(int j= 0; j<=5; j++){
                if(i==1 && j==0 || i==2 && j==0 || i==2 && j==1){
                    System.out.println("");
                    continue;
                }
                System.out.print(j+" ");
            }
           // System.out.println();
        }
    }
}
