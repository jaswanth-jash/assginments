package november;

public class DadClass1 {
    // //Parent class constructor
    DadClass1() {
        System.out.println("Constructor of parent class ");
    }

    void disp() {
        System.out.println("Parent method");
    }
}

class ChildClass extends DadClass1 {
    ChildClass() {
        System.out.println("Constructor of child class");
    }

    void disp() {
        System.out.println("Child class");
        //Calling the disp() method of parent class
        super.disp();
    }

    public static void main(String args[]) {
        ChildClass cc = new ChildClass();
        cc.disp();
    }
}
