package class4;

public class NestedIfDemo_7 {
    public static void main(String[] args) {

        boolean studyHard= true;
        int salary= 120000;

        if(studyHard){
            System.out.println("We get the jobs");

            if(salary>100000){
                System.out.println("Buy a Tesla");
            }else{
                System.out.println("Lets buy toyota");
            }

        }else{
            System.out.println("It might take a while");
        }




    }
}
