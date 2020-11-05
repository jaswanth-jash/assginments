package november;

public class Teacher2 {
    /*
     If the members or methods of super class are declared as
     private then the derived class cannot use them directly.
     The private members can be accessed only in its own class
      Such private members can only be accessed using public or
      protected getter and setter methods of super class
     */

    private String designation = "Teaching Staff ";
    private String collegeName = "Narayana";

    public String getDesignation() {
        return designation;
    }

    void setDesignation(String designation) {
        this.designation = designation;
    }

     public String getCollegeName() {
        return collegeName;
    }

    void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    void does() {
        System.out.println("Teaching");
    }
}

class JavaExample extends Teacher2 {
    String mainSubject = "Physics";

    public static void main(String args[]) {
        JavaExample obj = new JavaExample();
        /* Note: we are not accessing the data members
          directly we are using public getter method
          to access the private members of parent class
         */
        System.out.println(obj.getCollegeName());
        System.out.println(obj.getDesignation());
        System.out.println(obj.mainSubject);
        obj.does();
    }
}
