//Question 2 :- Create one parent class Vehicle, and two child classes Car and Bike.



class Vehicle{
    void about(){
        System.out.println("Vehicles are used for the purpose of Tansportation.");
    }
    
}

class Car extends Vehicle{
    void use(){
        System.out.println("Car is a four wheeler vehicle comes with many features and models.");
    }
    
}

class Bike extends Vehicle{
    void wheels(){
        System.out.println("Bike is a two wheeler vehicle.");
    }
    
}

public class Question2 {
    public static void main(String[] args) {
        Car a = new Car();
        a.about();
        a.use();

        Bike b = new Bike();
        b.about();
        b.wheels();
    }

}
