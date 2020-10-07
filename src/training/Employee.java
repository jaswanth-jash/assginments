package training;

public class Employee {
    float salary = 20000;
}

class Programmer extends Employee {
    int bonus = 3000;

    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("this single inheritance \n");
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}
