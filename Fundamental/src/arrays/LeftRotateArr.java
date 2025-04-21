package arrays;

import java.util.Arrays;

public class LeftRotateArr {

    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 5};
        Arrays.stream(leftRotate(Arrays.copyOf(arr, arr.length), 3)).forEach(System.out::println);
        Arrays.stream(leftRotate2(arr, arr.length, 3)).forEach(System.out::println);
    }

    private static int[] leftRotate(int[] arr, int times) {
        if(times == 0) return arr;
        int firstElem =  arr[0];
        int temp = 0;
        for (int i = 0; i < arr.length -1 ; i++) {
            temp = arr[i] ;
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        arr[arr.length -1 ] = firstElem;
        return leftRotate(arr, times - 1);

    }

    // Time: Θ(2n) = Θ(n), Auxiliary Space: Θ(1)
    private static int[] leftRotate2(int[] arr, int n, int d) {
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        return arr;
    }

    private static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            swap(arr, low, high);
            low++;
            high--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
