// poly means many; morph means many 
// There are 2 types of Polymoriphism:
// 1] Compile time: Method Overloading, also known as Static Polymorphism
// 2] Run time: Method Overriding, also known as Dynamic Polymorphism : method with same name
// super keyword


class Animal {
    void sound() {
        System.out.println("Animal is speaking");
    }
}

class Cat extends Animal {
    void sound() {
        super.sound();
        System.out.println("cat is meowing");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();
        System.out.println("dog is barking");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();
    }
}