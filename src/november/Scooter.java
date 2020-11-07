package november;

abstract public class Scooter {
    //constructor class
    Scooter() {
        System.out.println("Scooter is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("gear changed");
    }
}

//Creating a Child class which inherits Abstract class
class Shine extends Scooter {
    Shine() {
        super();
        System.out.println("Shine is created");
    }

    void run() {
        System.out.println("running safely..");
    }

    public static void main(String args[]) {
        Scooter obj = new Shine();
        obj.run();
        obj.changeGear();
    }
}
