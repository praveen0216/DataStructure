package arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class CheckSortedArrayDemo {

    public static void main(String[] args) {
        int [] arr1 = {8, 12, 15} ;
        int [] arr2 = {8, 10, 10 , 12};
        int [] arr3 = {100};
        int [] arr4 = { 100, 20, 200};
        Stream<int[]> arr = Stream.of(arr1, arr2, arr3, arr4);
        arr.forEach( a -> System.out.println(Arrays.toString(a) + " : "+isSortedArray(a)));
    }

    private static boolean isSortedArray(int[] arr) {
        for (int i = 1 ; i < arr.length ; i ++) {
            if(arr[i] < arr[i-1]) return false;
        }
        return true;
    }
}
