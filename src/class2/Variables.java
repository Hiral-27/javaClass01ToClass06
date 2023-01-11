package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a box in the computer's memory.
        we are calling it box1 if we need the information that we are storing this box
        we can simply say to the computer to give us the content of box1
        int-> what type of date we want to store
        box1-> is the name of the box
        = -> sign will take whatever we write after it & will store it inside the box1
        10-> is what we are storing inside the box
        */
        int box1= 10;
        System.out.println(box1);

        /* integers- whole numbers without decimals, eg: 10 20 500 80000 360000
           To store whole numbers we have 4 different types of boxes.
           It's in asscending order:
           1) byte [range -128 to 127] [max limit in positive is 127 & in negative is -128]
           2) short [range -32768 to 32767]
           3) int [range -2147483648 to 2147483647] //Most commonly used type
           4) long [range -9223372036854775808l to 9223372036854775807l] // In long at the end put l to it
         */




        /* Task 1: Reserve a box which can hold the box 10000 call it myBox and print its value on the
            console */
        short myBox = 10000;  // you can use int as well
        System.out.println(myBox);



    }
}
