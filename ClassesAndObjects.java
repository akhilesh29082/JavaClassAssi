public class ClassesAndObjects {   

    // acess modifier : public private protected


    // public void play(){
    //     System.out.println("you are playing");
    // }

    // public void not(){
    //     System.out.println("you are not playing");
    // }
    // public static void main(String[] args) {
    //     ClassesAndObjects myObj = new ClassesAndObjects();

    //     myObj.play();
    //     myObj.not();
    // }
    public void display() {
        System.out.println("Hello, this is a method in ClassObj.");
    }
    public void show() {
        System.out.println("This is show method in ClassObj.");
    }
    public static void main(String[] args) {
        //create an instance of ClassObj
        ClassesAndObjects obj = new ClassesAndObjects();
        obj.display();
        obj.show();

    }
}

