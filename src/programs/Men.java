package programs;

public class Men {
    String name ="jay";   // instance variable
    int age = 03;
    void playing(){
        System.out.println( "jay playing in home");
    }
    void eating(){
        System.out.println("eating snacks");
    }
    public static void main(String arg[]){
        Men m1 = new Men();
        System.out.println(m1.name);
        System.out.println(m1.age);
        m1.playing();
        m1.eating();
    }
}
