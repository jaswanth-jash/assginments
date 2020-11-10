package november;

interface Team1 {
    void print2();
}

interface Team3 extends Team1 {
    void given();
}

class Team2 implements Team3 {

    @Override
    public void print2() {
        System.out.println("Ayyappa team1");
    }

    @Override
    public void given() {
        System.out.println("Vamsee Team2");
    }

    public static void main(String args[]) {
        Team2 t = new Team2();
        t.print2();
        t.given();
    }
}

