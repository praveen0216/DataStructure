package utils;

public class NumberUtil {

    private NumberUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isPrimeNumber(int n) {
        if (n==0 || n ==1 ) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }

        if (n%2 == 0 || n %3 == 0) {
            return false;
        }

        for(int i = 5 ; i*i <= n; i = i+6) {
            if(n%i == 0 || n %(i+2) == 0)
                return false;
        }
        return true;
    }

    public static int getFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * getFactorial(n-1);
        }
    }

    public static int getSumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + getSumOfNaturalNumbers(n-1);
        }
    }
}
