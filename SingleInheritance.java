// Here Animal is Parent class where as Cat is child class.
// Child class can use the properties of parent class but parent class can't use the methods and functions and properties of childclass.
// This is a example of Single inheritance as there is a single parent and single child.


class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("cat is meowing");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();

        Animal a= new Animal();
        a.eat();
    }
}

