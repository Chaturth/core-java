package Programs;

import java.util.Arrays;

public class ArraysBuiltInMethods {

    public static void main(String[] args) {

        int[] numbers = {50, 20, 40, 10, 30};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 1. sort()
        Arrays.sort(numbers);
        System.out.println("After sort(): " + Arrays.toString(numbers));

        // 2. binarySearch()
        int result = Arrays.binarySearch(numbers, 30);
        System.out.println("Position of 30: " + result);

        // 3. copyOf()
        int[] copy = Arrays.copyOf(numbers, 7);
        System.out.println("After copyOf(): " + Arrays.toString(copy));

        // 4. copyOfRange()
        int[] range = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("After copyOfRange(): " + Arrays.toString(range));

        // 5. equals()
        int[] numbers2 = {10, 20, 30, 40, 50};
        System.out.println("Arrays are equal: " + Arrays.equals(numbers, numbers2));

        // 6. fill()
        int[] values = new int[5];
        Arrays.fill(values, 100);
        System.out.println("After fill(): " + Arrays.toString(values));

        // 7. toString()
        System.out.println("Array using toString(): " + Arrays.toString(numbers));


    }
}
