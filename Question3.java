// Question 3:- Create a class Employee with fields id, name, and salary. Write a method to display employee information. 
//Create multiple employee objects and call the method.

class Employee{
    void EmployeeInfo(int id, String name, double salary ){

        System.out.println("Complete Employee Information:");
        System.out.println("ID:- "+id);
        System.out.println("Name:- "+name);
        System.out.println("Salary:- "+salary);
        System.out.println();
    }
}


public class Question3 {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.EmployeeInfo(1,"amy" , 60000);

        Employee b = new Employee();
        b.EmployeeInfo(1,"john" , 90000);
        Employee c = new Employee();
        c.EmployeeInfo(1,"karl" , 50000.65);
        Employee d = new Employee();
        d.EmployeeInfo(1,"jason" , 70000.97);
    }
}
