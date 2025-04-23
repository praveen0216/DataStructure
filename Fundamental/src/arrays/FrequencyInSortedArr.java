package arrays;

import java.util.stream.Stream;

public class FrequencyInSortedArr {

    public static void main(String[] args) {
        int[] arr1 = {10, 10, 10, 25, 30, 30};
        int[] arr2 = {10, 10, 10, 10};
        int[] arr3 = {10, 20, 30};
        Stream<int[]> arr = Stream.of(arr1, arr2, arr3);
        arr.forEach(FrequencyInSortedArr::printFrequency);
    }

    private static void printFrequency(int[] a) {
        if (a.length == 0) return;

        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                System.out.println(a[i - 1] + " -> " + count);
                count = 1;
            }
        }

        // Print frequency for the last group
        System.out.println(a[a.length - 1] + " -> " + count);
        System.out.println();
    }
}

