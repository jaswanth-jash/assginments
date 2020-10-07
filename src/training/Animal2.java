package training;

public class Animal2 {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal2 {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog1 extends Animal2 {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class MyMainClass {
    public static void main(String[] args) {
        Animal2 myAnimal = new Animal2();
        Animal2 myPig = new Pig();
        Animal2 myDog = new Dog1();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}

