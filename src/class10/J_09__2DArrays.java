package class10;

import java.util.Arrays;

public class J_08__2DArrays {
    public static void main(String[] args) {

        // 2D Array which can hold 3 rows---> one D Array
        // each of size 3
        String[][] thomasTrain= new String[3][3];
        String[] cabin0={"Adem","Zafar","Sam"};
        String[] cabin1={"Nabi","Saud","Anees"};
        String[] cabin2={"Safi", "Abeera", "Zahra"};

        thomasTrain[0]= cabin0;
        thomasTrain[1]= cabin1;
        thomasTrain[2]= cabin2;

        // in the first [] we specify the address of 1 D ARRAY
        System.out.println(thomasTrain[2][1]);
        System.out.println(Arrays.toString(thomasTrain[0]));  // To print 1 whole cabin (array)
    }
}
