public class Abtraction{
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);


        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang myHorse = new Mustang();
        //Animal --> Horse --> Mustang
    }
}

abstract class Animal {
    String color;
    Animal(){
        System.out.println("animal constructoe called");
    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        color = "dark-brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){// constructor
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }

}