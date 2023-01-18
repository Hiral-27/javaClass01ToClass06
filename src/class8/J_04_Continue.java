package class8;

public class J_04_Continue {
    public static void main(String[] args) {

        // Continue acts as Skip

        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                continue;  // works as skip
            } else {
                System.out.println(i);
            }
        }


    }
}
