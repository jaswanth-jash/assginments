package november;

public interface House {
    void flates();
}

class House1 implements House {
    public void flates() {
        System.out.println("3 BHK house");
    }

     class House2 implements House {

        @Override
        public void flates() {
            System.out.println("2 BHK house ");
        }
    }

    public static void main(String args[]) {
        House h = new House1();
       //House h1 = new House2();
        h.flates();
       // h1.flates();
    }
}

