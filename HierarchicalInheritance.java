// its not compulsory that the main class should be in the the public class it can be in any either of the classes also.

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("cat is meowing");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("dog is barking");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();

        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
