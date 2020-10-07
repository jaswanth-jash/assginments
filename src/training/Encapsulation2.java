package training;

public class Encapsulation2 {
    private long acc_no;
    private String name, email;
    private float amount;

    //public getter and setter methods
    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        Encapsulation2 en2 = new Encapsulation2();
        en2.setAcc_no(987654321);
        en2.setName("Jaswanth");
        en2.setEmail("jaswanthg12@gmail.com");
        en2.setAmount(109090009f);
        System.out.println(en2.getAcc_no());
        System.out.println(en2.getName());
        System.out.println(en2.getEmail());
        System.out.println(en2.getAmount());
    }
}
