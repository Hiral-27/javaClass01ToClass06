package class3;

public class VariablesDemo_2 {
    public static void main(String[] args) {
        /*
        To rename variable, class, files or anythung just right click then refactor and then rename
         */
        int age= 10;
        System.out.println(age);// Output- 10
        age= 20;
        System.out.println(age);//Output- 20
        int number= 10;
        age= number; // Here age is not 20 now it is equal to number value
        System.out.println(age); //Output- 10
        age=number+10; // Here number value was 10+ 10
        System.out.println(age); //Output- 20
        age=age+20; // Here age value was 20+ 20
        System.out.println(age); //Output- 40

    }
}
