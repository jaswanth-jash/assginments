package programs;

public class Dog {
    private String name = "jockey";
    private int cost = 20000;
    private String color = "white";
    void barking(){
        System.out.println("barking");
    }
    void eating(){
        System.out.println("eating");
    }
    void sleeping(){
        System.out.println("sleeping");
    }

    public static void main(String arg[]){
        Dog d1 = new Dog();
        d1.barking();
        d1.eating();
        d1.sleeping();
        System.out.println(d1.name );
        System.out.println(d1.cost);
        System.out.println(d1.color);
    }
}
