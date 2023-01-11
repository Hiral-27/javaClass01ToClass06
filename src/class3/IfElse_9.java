package class3;

public class IfElse_9 {
    public static void main(String[] args) {

        boolean isTrue=false;
        if(isTrue!=false){
            System.out.println("1");
        }

        char c= 'M';
        if(c=='M'){
            System.out.println("Male");
        }
        if(c=='F'){
            System.out.println("Female");
        }

        //*** String
        /*
        With Non Primitive datatypes we can't use == we have to use method--->  .equals
         */
        String name= "Samy";
        if(name.equals("Sam")){
            System.out.println("Amazing Student");
        }
        if(!name.equals("Sam")){
            System.out.println("Super Amazing Student");
        }



    }
}
