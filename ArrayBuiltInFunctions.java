import java.util.Arrays;

public class ArrayBuiltInFunctions {
    public static void main(String[] args) {
        int[] arr = {9,7,4,5,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 5));
    }
}