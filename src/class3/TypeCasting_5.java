package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        // TypeCasting- Converting one Data type into another Data type
        long number=125;
        byte shorterNumber= (byte)number;
        System.out.println(shorterNumber);
        float f= 10.5f;
        int num= (int) f;
        System.out.println(num);
        int i= 10000;
        float num2= (float) i; //(float) datatype in brackets are Typecasting
        System.out.println(num2);

        /*
        If you try to store the value from the smaller datatype to the larger data type Java doesn't complain
        because of the size, but
        If you try to the value from the larger datatype to smaller datatype Java does complain because it has less
        size.
         */
        byte b= 10;
        int number2= b;
        short c= (short) number2;
        /*
        It basically says that the data type should be short and c is the name of the variables and its typecasted
        inside the bracket again as short and the value is number2 which is the value of int from top
           */
        System.out.println(b);

        /*
        You can convert char through Ascii Table
         */
        System.out.println((char)97); //Asking Java, that what is dedicated to char 97 in the Ascii table



    }
}
