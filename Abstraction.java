// What Is Abstraction?
// Abstraction means hiding the internal details and only showing the important information.

// Think of it like this:

// When you use a TV remote, you press a button to change the channel.
// You don’t need to know how the remote sends signals to the TV — that’s hidden.

// In programming, abstraction helps you:

// Focus on what an object does,
// Not how it does it.



// Why Do We Need Abstraction?
// It helps you:

// Make complex programs easier to understand.

// Change internal code without affecting other code.

// Improve security (by hiding data).

// Make your code reusable and maintainable.

// How Is Abstraction Done in Java?
// There are two ways to do abstraction in Java:

// Way	Keyword	What it is
// 1. Abstract Class	abstract	A class that can have both abstract (no body) and normal methods.
// 2. Interface        	interface	A pure abstraction tool (contains only method declarations in older versions).






// // Abstract class
// abstract class Animal {

//     // Abstract method (no body)
//     abstract void makeSound();

//     // Regular method (has body)
//     void eat() {
//         System.out.println("This animal eats food.");
//     }
// }

// // Subclass that extends the abstract class
// class Dog extends Animal {

//     // Implementing the abstract method
//     void makeSound() {
//         System.out.println("Bark!");
//     }
// }

// // Main class to run the code
// public class Abstraction {
//     public static void main(String[] args) {
//         Dog d = new Dog(); // Create a Dog object
//         d.makeSound();     // Calls Dog's version of makeSound()
//         d.eat();           // Calls method from abstract class
//     }
// }



// Interface (fully abstract)
interface Animal {

    // Abstract method
    void makeSound();
}

// Class that implements the interface
class Cat implements Animal {

    // Implementing the interface method
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class to run the code
public class Abstraction {
    public static void main(String[] args) {
        Cat c = new Cat(); // Create Cat object
        c.makeSound();     // Calls method defined in Cat
    }
}
