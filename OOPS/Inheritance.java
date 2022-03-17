class animal {

    void walk() {
        System.out.println("I am walking");
    }
}

class bird extends animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        bird b1 = new bird();
        b1.walk();
        b1.fly();
        b1.sing();
    }
}