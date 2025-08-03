import java.util.Arrays;

public class ArrayBuiltInFunctions {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 4));
    }
}
