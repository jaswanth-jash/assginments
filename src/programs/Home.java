package programs;

public class Home {
    String area = "pedda street" ;
    int address = 152;
    String color = "brown";
    void openDoor(){
        System.out.println("open the door");
    }
    void closeDoor(){
        System.out.println("close the door");
    }

    public static void main(String arg[]){
        Home h1 = new Home();
        System.out.println(h1.area);
        System.out.println(h1.address);
        System.out.println(h1.color) ;
        h1.openDoor();
        h1.closeDoor();


    }
}
