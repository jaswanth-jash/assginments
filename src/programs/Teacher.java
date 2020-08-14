package programs;

public class Teacher {
    String name ="Radha";
    int age = 40;
    void teaching(){
        System.out.println("Teachng a java");
    }
    void experience(){
        System.out.println("he has 10 + experience");
    }
    static public void main(String arg[]){
        Teacher t1 =new Teacher();
        System.out.println(t1.name);
        System.out.println(t1.age);
        t1.teaching();
        t1.experience();
    }
}
