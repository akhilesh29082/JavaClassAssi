class Addition{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }
}



public class OverloadingMethod {
    public static void main(String[] args) {
        Addition x = new Addition();
        int ans1 = x.add(1, 5);
        int ans2 = x.add(9, 7,5);
        double ans3 = x.add(5.54, 55.5);

        System.out.println("Answer 1 is: "+ans1);
        System.out.println("Answer 2 is: "+ans2);
        System.out.println("Answer 3 is: "+ans3);

    }
}
