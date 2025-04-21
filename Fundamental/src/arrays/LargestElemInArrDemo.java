package arrays;

public class LargestElemInArrDemo {

    public static void main(String[] args) {
        int [] arr = {100, 30, 60, 10, 66, 98, 102, 988, 89, 175, 101} ;
        printLargestElementAndPosition(arr);
    }

    private static void printLargestElementAndPosition(int[] arr) {
        if(arr != null && arr.length > 0) {
            int MAX =  Integer.MIN_VALUE;
            int pos = 0;
            for(int i = 0; i < arr.length; i++) {
                if(MAX < arr[i]) {
                    MAX = arr[i];
                    pos = i;
                }
            }
            System.out.print("Largest element " + MAX + " in position " + pos);
        }
        return;
    }
}
