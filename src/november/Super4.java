package november;

public class Super4 {
    Super4() {
        System.out.println(" ordered one product");
    }
}

class Book extends Super4 {
    Book() {
        super();
        System.out.println(" you are order successfully");
    }

    public static void main(String args[]) {
        Book b = new Book();
    }
}


