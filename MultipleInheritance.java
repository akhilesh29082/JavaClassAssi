// implements keyword used if we are using the relation betwwen: CI(class and Interface) and IC(Interface and Class).
// For CC( Class and Class) and II(Interface and Interface) use extends


interface p1{
    default void parent1(){
        System.out.println("Hello there, I am Parent 1 of child class.");
    }
}

interface p2{
    default void parent2(){
        System.out.println("Hello there, I am Parent 2 of child class.");
    }
}

class childClass implements p1, p2{
    void hello(){
        System.out.println("Hello there, I am the Child Class.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        childClass c = new childClass();
        c.hello();
        c.parent1();
        c.parent2();
    }
}
