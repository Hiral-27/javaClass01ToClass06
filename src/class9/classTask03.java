package class9;

public class classTask03 {
    public static void main(String[] args) {
        /*
       1) Create an empty array then store 45, 44, 30, 20, 10 in it then use a loop to add all the elements
        which are present on even indexes and print it
         */
        int[] number = new int[5];

        number[0]= 45;
        number[1]= 44;
        number[2]= 30;
        number[3]= 20;
        number[4]= 10;
        int sum= 0;
        for (int i = 0; i < number.length; i++) {
            if(i%2==0){
                sum= sum+number[i];
            }
        }
        System.out.println(sum);
    }
    // if you wanna check even indexes so we write (i%2==0) i represents the index
    // if you wanna check the values of arrays are even or odd we write (variable name[index]) (numbers[i]% 2==0)
}
