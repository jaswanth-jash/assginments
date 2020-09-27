package chapter6;

public class Dog4 {
    String name;
    int cost;
    String bread;

    Dog4(String name, int cost, String bread) {
        this.name = name;
        this.cost = cost;
        this.bread = bread;
    }

    void res() {
        System.out.println("name : " + name + ", cost : " + cost + ", bread : " + bread + " ");
    }

    public static void main(String[] args) {
        Dog4 d = new Dog4("husky", 30000, "doberman");
        Dog4 d1 = new Dog4("rockey", 10000, "bulldog");
        d.res();
        d1.res();
    }
}
