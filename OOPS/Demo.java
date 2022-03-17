public class Demo {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen();

        Student s1 = new Student();
        s1.name="harry";
        s1.age=21;
        s1.info();

        p1.color = "blue";
        p2.color = "black";

        p1.write();
        p1.printcolor();
        p2.printcolor();
    }
}

class Student {
    String name;
    int age;

    public void info() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Main task is to write");
    }

    public void printcolor() {
        System.out.println(this.color);
    }
       
}

