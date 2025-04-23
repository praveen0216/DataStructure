package arrays;


import java.util.Arrays;
import java.util.stream.Stream;


public class MaxDiffInArr {
    public static void main(String[] args) {
        int[] arr1 = {2,3,10,6,4,8,1};
        int[] arr2 = {7,9,5,6,3,2};
        int[] arr3 = {10,20,30};
        int[] arr4 = {30, 10, 8, 2};
        Stream<int[]> arr = Stream.of(arr1, arr2, arr3, arr4);
        arr.forEach( a -> System.out.println(Arrays.toString(a) + " : "+ getMaxDiff(a)));
    }

    /**
     * Maximum difference
     *
     * max value of arr[j] - arr[i] such that j>i
     *
     * Time complexity : theta(n)
     * Space complexity : theta(1)
     *
     */
    private static int getMaxDiff(int[] a) {
        int max = a[1] -a[0];
        int min = a[0];
        for(int i = 1; i < a.length; i++) {
           max = Math.max(max, a[i] - min);
           min = Math.min(min, a[i]);
        }
        return max;
    }
}
