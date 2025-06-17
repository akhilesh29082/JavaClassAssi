public class Array {
    public static void main(String[] args) {
        //explaining the concept of arrays


        // In Java, an array is a data structure used to store multiple values of the same type in a single variable. 
        // Each element in the array is accessed using an index, which starts from 0.
        int[] num={1,2,6,3,8};
        char[] characters = {'A','B','C','D'};
        int a = num[1];
        System.out.println(a);

         // 1. Declare and initialize an array of integers
         int[] numbers = new int[5];  // Array of size 5

         // 2. Assign values to the array
         numbers[0] = 10;
         numbers[1] = 20;
         numbers[2] = 30;
         numbers[3] = 40;
         numbers[4] = 50;
 
         // 3. Access and print array elements using a loop
         System.out.println("Array elements:");
         for (int i = 0; i < numbers.length; i++) {
             System.out.println("Element at index " + i + ": " + numbers[i]);
         }



         //Java program that takes an array of integers and finds the maximum and minimum elements.


         int[] arr = {23, 45, 12, 78, 34, 89, 2};

         // Initialize max and min with the first element
         int max = arr[0];
         int min = arr[0];
 
         // Loop through the array
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] > max) {
                 max = arr[i];  // Update max
             }
             if (arr[i] < min) {
                 min = arr[i];  // Update min
             }
         }
 
         // Output the results
         System.out.println("Maximum value: " + max);
         System.out.println("Minimum value: " + min);




    }
}