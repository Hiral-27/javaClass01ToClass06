package class6;

public class classTask06 {
    public static void main(String[] args) {

        // Question: 1 2 3 4 6  7 8 9 11 12 13 14 16, Skip 5 multiples(5 10 15)
        int num=1;
        while(num<=16){
            if(num%5!=0){
                System.out.println(num);
            }
            num++;
        }
    }
}
