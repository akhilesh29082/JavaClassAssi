public class loops {
    public static void main(String[] args){

        // switch case
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Something went wrong");
        }

        //While loop
        int i = 0;
        while (i <= 10) {
        System.out.println(i);
        i++;
        }

        //do while
        int k = 0;
        do {
        System.out.println(k);
        k++;
        }
        while (k <= 5);


        //for loop
        for (int j = 0; j <= 10; j = j + 2) {
            System.out.println(j);
        }
}}
