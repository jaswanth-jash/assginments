package november;

public class Teacher1 {
    String designation = "Teachers";
    String collegeName = "Edify";

    void does() {
        System.out.println("Teaching");
    }
}

class PhysicsTeacher extends Teacher1 {
    String mainSubject = "Physics";
}

class MathsTeacher extends Teacher1 {
    String Subject1 = "Maths";
}

class MusicTeacher extends Teacher1 {
    String Subject = "music";


    public static void main(String args[]) {
        PhysicsTeacher obj = new PhysicsTeacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        MathsTeacher mt = new MathsTeacher();
        System.out.println(mt.Subject1);
        MusicTeacher m = new MusicTeacher();
        System.out.println(m.Subject);
        obj.does();
    }
}

