class ParaConst {
    String name;
    int age;

    // Parameterized constructor
    ParaConst(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        ParaConst p1 = new ParaConst("Alice", 30); // Calling parameterized constructor
        p1.display();
    }
}
