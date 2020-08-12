package programs;
public class Car{
         String brand = "BMW";
         String model = "dezire";
         String color ="red";
         int cost = 2000000;
         void accelerate() {
         System.out.println("accelerating");
         }
         void slowDown(){
         System.out.println("slow dowing");
         }
         void gearChange(){
         System.out.println("gear changing");
         }
public static void main(String arg[]){
        Car c1 = new Car();
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.cost);
        c1.accelerate();
        c1.slowDown();
        c1.gearChange();
        }
        }
