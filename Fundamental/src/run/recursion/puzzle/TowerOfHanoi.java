package run.recursion.puzzle;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {

        System.out.println("Enter the number of disk");
        Scanner sc = new Scanner(System.in);
        towerOfHanoi(sc.nextInt(), 1, 3);

    }

    private static void towerOfHanoi(int n, int start, int end) {
        int other = 0 ;
        if(n ==1 ) {
            print(start, end);
        }
        else {
            other = 6 - (start + end);
            towerOfHanoi(n-1, start, other);
            print(start, end);
            towerOfHanoi(n-1, other, end);
        }

    }

    private static void print(int start, int end) {
        System.out.println("from -> " + start + " to -> " + end);
    }
}
