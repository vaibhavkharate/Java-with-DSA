public class Constructor {
    public static void main(String[] args) {
        // Student s1 = new Student("vaibhav");
        Student s1 = new Student();
        // System.err.println(s1.name);
    }
}

class Student {
    String name;
    int roll;

    Student (){
        // this.name = name;
        System.out.println("Constructor is called");
    }
}