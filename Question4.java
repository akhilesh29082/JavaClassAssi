// uestion 4:- Write a program to create a class Calculator with methods to perform addition, subtraction, multiplication, and division. 
// Create an object and perform all operations.
class Calculator{
    void add(double a, double b){
        double result = a+b;
        System.out.println("Addition is "+result);
    }
    void subtract(double a, double b){
        double result = a-b;
        System.out.println("Subtraction is "+result);
    }
    void multiply(double a, double b){
        double result = a*b;
        System.out.println("Multuplication is "+result);
    }
    void div(double a, double b){
        double result = a/b;
        System.out.println("Division is "+result);
    }
}
public class Question4 {
    public static void main(String[] args) {
        Calculator a = new Calculator();
        a.add(9, 50);
        a.subtract(5.6,9);
        a.multiply(9, 6);
        a.div(9, 2);
    }
}
