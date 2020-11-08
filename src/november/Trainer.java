package november;

public interface Trainer {
    public void first();
}

interface Trainer2 {
    public void second();
}

class Team implements Trainer, Trainer2 {

    @Override
    public void first() {
        System.out.println("Ayyappa is trainer");
    }

    @Override
    public void second() {
        System.out.println("Vamsi is also a 2nd trainer");

    }

    public static void main(String args[]) {
        Team t = new Team();
        t.first();
        t.second();
    }
}

