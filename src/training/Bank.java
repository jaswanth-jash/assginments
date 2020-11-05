package training;

public class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

//Creating child classes.
class SBI extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class HDFC extends Bank {
    int getRateOfInterest() {
        return 7;
    }

//Test class to create objects and call the methods

    public static void main(String args[]) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        HDFC h = new HDFC();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("HDFC Rate of Interest: " + h.getRateOfInterest());
    }
}
