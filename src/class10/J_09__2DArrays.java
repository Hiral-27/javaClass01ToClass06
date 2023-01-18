package class10;

import java.util.Arrays;

public class J_09__2DArrays {
    public static void main(String[] args) {
//              Columns   0  1  2
        int[][] matrix= {{10,20,30,},  // Row 0
                         {55,22,45,50},   // Row 1
                         {100,220,450},  // Row 2
        };
        //System.out.println(matrix[1][1]);  // Output--> 22

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
