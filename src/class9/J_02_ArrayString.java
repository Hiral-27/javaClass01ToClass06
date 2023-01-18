package class9;

public class J_02_Arrays {
    public static void main(String[] args) {
        String [] names= {"Slava","Safi","Jason","Nabi","Anees","Joseph"};
        System.out.println(names[2]);
        System.out.println(names[4]);
        System.out.println(names[3]);
        System.out.println("***************");


        // Using For Loop print all the names in the above array
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }
        System.out.println(names.length);  // how many total names are there in the given Array
    }
}
