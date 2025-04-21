package arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseArrayDemo {

    public static void main(String[] args) {
        int [] arr1 = {8, 12, 15} ;
        int [] arr2 = {8, 10, 10 , 12};
        int [] arr3 = {100};
        int [] arr4 = { 100, 20, 200};
        Stream<int[]> arr = Stream.of(arr1, arr2, arr3, arr4);
        arr.forEach( a -> System.out.println(Arrays.toString(a) + " reverse -> "+ Arrays.toString(reverseArr(a))));
    }

    private static int[] reverseArr(int[] a) {
        if(a == null  || a.length == 0) return a;
        int temp = 0;
        for (int low = 0, high = a.length -1 ; low < high  ; low++ , high -- ) {
            temp =  a[low] ;
            a[low] = a[high];
            a[high] = temp;
        }
        return a;
    }
}
