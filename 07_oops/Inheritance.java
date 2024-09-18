public class Inheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

// Base/Parent class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats!");
    }

    void breathe() {
        System.out.println("Breaths!");
    }
}

// Derived/Sub/Child Class
/*
 * class Fish extends Animal {
 * int fins;
 * 
 * void swims() {
 * System.out.println("Swims in water");
 * }
 * }
 */

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}