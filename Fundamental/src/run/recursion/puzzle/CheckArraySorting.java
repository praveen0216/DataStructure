package run.recursion.puzzle;

import java.util.Scanner;

public class CheckArraySorting {

    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int k =0;
        System.out.println("Enter the element in an array");
        while(sc.hasNext() && k < 5) {
            System.out.println("Enter the element in an array");
            arr[k] = sc.nextInt();
            k++;
        }*/

        int[] arr = new int[] {1,7,3,4,5};

        System.out.println("Array is sorted ? " + isArraySorted(arr, args.length) );
    }

    private static boolean isArraySorted(int[] arr, int index) {
        if(arr.length == 1 || index == 0) {
            return true;
        }
        else {
            return arr[index-1] < arr[index-2] ?  false : isArraySorted(arr, index-1);
        }
    }
}
