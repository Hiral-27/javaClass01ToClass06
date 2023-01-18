package class10;

public class J_05_ForEachLoop {
    public static void main(String[] args) {

        // Limitations:  We can't update the elements in ForEachLoop because we don't have access to the index
        int [] arr={10,13,20,25,45,50};
        for(int x:arr){
            if(x%2!=0){
                x=0;
            }
        }

    }
}
