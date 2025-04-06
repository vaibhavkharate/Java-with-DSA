public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //constructor -  created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //p1.setColor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "vaibhavK";
        myAcc.setPassword("vaibhav123");
    }
}

class Pen {
    String color;
    int tip;
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Student {
    String name;
    int age;
    float percenatage; // CGPA
}