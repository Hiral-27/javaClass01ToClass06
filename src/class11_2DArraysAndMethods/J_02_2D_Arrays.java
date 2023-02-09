package class11;

public class J_02_2D_Arrays {
    public static void main(String[] args) {
        int[][] matrix= {{10, 20, 30},
                         {45, 55, 66},
                         {30, 40, 20, 10, 25}
        };
/*
        for(int i=0; i< matrix.length;i++){  // matrix.length tells us how many total rows are present in 2D Array
            for(int j=0; j< matrix[i].length; j++){    // matrix[i].length will give the size of each 1D Array
                System.out.print(matrix[i][j]+" ");  // matrix[0] [0]
                                                 // Go to row[0]...Grab all elements from row[0]
            }
            System.out.println();
        } */
/*
//---------------------------------------------------------------------------------------------
//       Print Odd Numbers from the 2D Array
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]%2!=0){
                    System.out.println("Odd Numbers: "+matrix[i][j]);
                } else {
                    System.out.println("Even Numbers: "+matrix[i][j]);
                }
            }
        } */

//-------------------------------------------------------------------------------------
//           Enhanced ForLoop
        for (int[] arr: matrix) {
            for (int number: arr) {
                System.out.print(number+" ");
            }
            System.out.println();
        }


    }
}
