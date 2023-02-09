package class11;

public class J_06_CatTester {
    public static void main(String[] args) {
        J_05_Cat cat1 = new J_05_Cat();
        // Assigning values to attributes
        cat1.name= "Snowbell";
        cat1.breed= "Turkish Cat";
        cat1.age= 2;
        cat1.color= "White";
        cat1.attitude= false;
        cat1.eat();

        J_05_Cat cat2= new J_05_Cat();
        cat2.name="Loki";
        cat2.breed= "Persian";
        cat2.age= 1;
        cat2.color= "Grey";
        cat2.attitude= true;
        cat2.speak();

    }
}
