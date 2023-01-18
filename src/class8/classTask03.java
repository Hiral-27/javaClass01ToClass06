package class8;

import com.sun.security.jgss.GSSUtil;

public class classTask03 {
    public static void main(String[] args) {
        /*
        0 1 2 3 4 5
        0 2 4 6 8 10
        0 3 6 12 15
         */
     /*   for(int i=0; i<3; i++){

           if(i==0){
               for (int j = 0; j <=5; j++) {
                   System.out.print(j+" ");
               }
           } else if (i==1) {
               for(int j=0; j<=10; j+=2){
                   System.out.print(j+" ");
               }
           }else {
               for (int j=0; j<=15; j+=3){
                   System.out.print(j+" ");
               }
           }
            System.out.println();
        }
         */



        for(int i=0; i<=5; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0; i<=10; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0; i<=15; i+=3){
            System.out.print(i+" ");
        }
        System.out.println();


        for(int i=1; i<=3;i++){
            for (int j=0; j<=5; j++){
                System.out.print((i*j)+" ");
                }
        }System.out.println();

    }

}
