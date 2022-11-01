package Collections.BinarySearch;

import java.util.Arrays;

public class BinarySearchExmpl3 {
    public static void main(String[] args) {
        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int res = Arrays.binarySearch(array, 8);
        System.out.println(res);
    }
}
