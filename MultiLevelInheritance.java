// here the class Animal is Grand parent class.
// Cat is Parent class and the child class of Animal, can access the properties of its parent class Animal only.
// Lastly Kitten is Child class of Cat and this class can access properties and functions of both the parent classes.


class Animal{ 
    void ani(){
        System.out.println("HI there, I am an Animal!!");
    }
 
}

class Cat extends Animal{
    void cat(){
        System.out.println("HI there, I am an Cat!!");
    }
}

class Kitten extends Cat{
    void kit(){
        System.out.println("HI there, I am an Kitten!!");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Animal class can perform its own functions and methods only.
        Animal a = new Animal();
        a.ani();

        // Cat class can perform its own functions and methods as well as the functions and methods of Animal class.
        Cat c = new Cat();
        c.ani();
        c.cat();

        // Kitten class can perform its own functions and methods as well as the functions and methods of Animal class and Cat class.
        Kitten k = new Kitten();
        k.ani();
        k.cat();
        k.kit();
    }
}
