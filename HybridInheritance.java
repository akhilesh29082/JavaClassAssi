// ***********************************GRAND_PARENT************************************************
// ****************************************||***************************************
// ********************************__________________************************************************
//********************************||****************||***************************
// *****************************PARENT_1**********PARENT_2**********************************
// ********************************__________________************************************************
// ****************************************||***************************************
// ***************************************CHILD***********************************************




// Interface 1
interface Printable {
    void print();
}

// Interface 2
interface Showable {
    void show();
}

// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Final class implementing multiple interfaces
class HybridDog extends Dog implements Printable, Showable {
    public void print() {
        System.out.println("Printing from Printable interface.");
    }

    public void show() {
        System.out.println("Showing from Showable interface.");
    }

    void displayInfo() {
        eat();   // from Animal
        bark();  // from Dog
        print(); // from Printable
        show();  // from Showable
    }
}

// Main class to run the program
public class HybridInheritance {
    public static void main(String[] args) {
        HybridDog hd = new HybridDog();
        hd.displayInfo();
    }
}
