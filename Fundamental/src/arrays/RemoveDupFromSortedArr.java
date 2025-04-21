package arrays;

import exception.InputException;

import java.util.Arrays;

public class RemoveDupFromSortedArr {

    public static void main(String[] args) {
        int[] inputArr = {10, 10, 20, 20, 20, 30, 30, 40, 40, 40,50};
        int newLength =  removeDupFromSortedArr(inputArr, inputArr.length);
        System.out.println(newLength);

        Arrays.stream(inputArr)
                .limit(newLength)
                .forEach(System.out::println);

    }


    public static int removeDupFromSortedArr(int[] arr, int size) {
        if(arr == null || size == 0) throw new InputException("Array is empty");
        int i =0;
        for(int j = 1; j< size; j ++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}


