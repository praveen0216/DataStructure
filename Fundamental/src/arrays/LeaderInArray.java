package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LeaderInArray {

    public static void main(String[] args) {
        int[] arr1 = {7, 10, 4, 10, 6, 5, 2};
        int[] arr2 = {10, 20, 30};
        int[] arr3 = {30, 20, 10};
        Stream<int[]> arr = Stream.of(arr1, arr2, arr3);
        arr.forEach( a -> System.out.println(Arrays.toString(a) + " : "+ getLeader_2(a)));
    }

    /**
     *
     * Time complexity : O(n)
     * Space complexity : O(n) , as i am storing
     *                  : O(1) . only print
     *
     * @param arr
     * @return
     */
    private static List<Integer> getLeader_2(int[] arr) {
        List<Integer> output = new ArrayList<>();
        int maxFromRight = arr[arr.length-1];
        output.add(maxFromRight);
        for(int i = arr.length - 2; i >= 0; i--){
          if(arr[i] > maxFromRight) {
              maxFromRight = arr[i];
              output.add(maxFromRight);
          }
        }
        Collections.reverse(output);
        return output;
    }

    private static List<Integer> getLeader_1(int[] a) {
        List<Integer> output = new ArrayList<>();
        output.add(a[a.length-1]);
        boolean flag = false;
        for(int i = a.length-2; i >=0; i--) {
            for(int j = i + 1 ; j < a.length; j++) {
                if(a[i]<a[j]) {
                    flag = true;
                }
            }
            if (!flag && !output.contains(a[i])) {
                output.add(a[i]);
            }
           flag = false;
        }
        Collections.reverse(output);
        return output;

    }


}
