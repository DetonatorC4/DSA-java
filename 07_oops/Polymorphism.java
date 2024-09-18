public class Polymorphism {
    public static void main(String[] args) {

        /*
         * Calculator calc = new Calculator();
         * 
         * System.out.println(calc.sum(1, 2));
         * System.out.println(calc.sum(1.3f, 2.2f));
         * System.out.println(calc.sum(1, 2, 3));
         */

        Deer d = new Deer();
        d.eat();

    }
}

class Animal {
    void eat() {
        System.out.println("Eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats grass");
    }

}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}