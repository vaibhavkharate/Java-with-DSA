

public class Inheristance{
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.err.println(dobby.legs);

        // method overriding

        Deer d = new Deer();
        d.eat();

    }
}

// Base Class
class Animal{
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Mammal extends Animal {
    int legs;

}

class Dog extends Mammal {
    String breed;
}

// method overriding 

class Animal2 {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal2 {
    void eat() {
        System.out.println("eats grass");
    }
}