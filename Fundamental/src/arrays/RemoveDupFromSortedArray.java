package arrays;

import java.util.Arrays;

public class RemoveDupFromSortedArray {

    public static void main(String[] args) {
        int a[] = {10,20,30,30,40,50};
        System.out.println("Array with no duplicate" + Arrays.toString(removeDuplicate(a)) );
    }

    private static int[] removeDuplicate(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        int temp[] = new int[arr.length];
        temp[0] = arr[0];
        int lastTempArrIndex = 0;
        for(int i = 1 ; i< arr.length; i++ ) {
            if(temp[lastTempArrIndex]  != arr[i]) {
                temp[lastTempArrIndex+1] = arr[i];
                lastTempArrIndex++;
            }
        }
        return temp;
    }

}
