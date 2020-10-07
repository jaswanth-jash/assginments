package training;

public class Encapsulation1 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Encapsulation1 myObj = new Encapsulation1();
        myObj.setName("jaswanth"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }
}
