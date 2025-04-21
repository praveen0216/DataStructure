package arrays;

import exception.InputException;

import java.util.Arrays;

public class ShiftZeroToEnd {

    public static void main(String[] args) {
        int[] arr = {0, 0, 8, 5, 0, 0, 10, 0,0, 20};

        //deep copy of array so that we can use same array for different approach
        Arrays.stream(shiftZeroAtEnd1(Arrays.copyOf(arr, arr.length))).forEach(System.out::println);
        Arrays.stream(shiftZeroAtEnd2(arr)).forEach(System.out::println);
    }

    private static int[] shiftZeroAtEnd2(int[] arr) {
        if(arr == null || arr.length == 0) throw new InputException("Array is empty");
        int count = 0;
        for( int i = 0 ; i < arr.length; i ++) {
            if(arr[i]!=0) {
                swap(arr, count, i);
                count++;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int count, int i) {
        int temp;
        temp = arr[count];
        arr[count] = arr[i];
        arr[i] = temp;
    }


    private static int[] shiftZeroAtEnd1(int[] arr) {
        if(arr == null || arr.length == 0) throw new InputException("Array is empty");
        int j = 0;
        for( int i = 1 ; i < arr.length  ; i++) {
            if(arr[i] != 0) {
                arr[j] = arr[i];
                if( i != j) {
                    arr[i] = 0;
                }
                j++;
            }
        }
        return arr;
    }
}
