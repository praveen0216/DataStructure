package arrays;

public class SecondLargestElemInArrDemo {

    public static void main(String[] args) {
        int [] arr = {100, 30, 60, 10, 66, 98, 102, 988, 89, 175, 101} ;
        printSecondLargestElementAndPosition(arr);
    }

    private static void printSecondLargestElementAndPosition(int[] arr) {
        if(arr != null && arr.length > 0) {
           int first = 0;
           int second = -1;
            for(int i = 0; i < arr.length; i++) {
               if(arr[i] > arr[first]) {
                   second = first ;
                   first = i;
               } else if (arr[i] != arr[first]) {
                   if (second == -1 || arr[i] > arr[second])
                       second = i;
               }
            }
            System.out.print("Second Largest element " + arr[second] + " in position " + second);
        }
        return;
    }
}
