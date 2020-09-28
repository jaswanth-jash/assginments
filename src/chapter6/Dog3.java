package chapter6;

public class Dog3 {
    String name;
    int cost;
    String bread;

    Dog3(String name, int cost, String bread) {
        this.name = name;
        this.cost = cost;
        this.bread = bread;
    }

    void res() {
        System.out.println("name : " + name + ", cost : " + cost + ", bread : " + bread + " ");
    }

    public static void main(String[] args) {
        Dog3 d = new Dog3("jockey", 20000, "Gremanshepad");
        d.res();
    }
}
