//Encapsulation in java
public class Encapsulation {
    // Step 1: Private data members
    private String name;
    private int age;

    // Step 2: Public getter method for name
    public String getName() {
        return name;
    }

    // Step 3: Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) {  // simple validation
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Encapsulation s = new Encapsulation();
        s.setName("Harshada");
        s.setAge(20);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}

