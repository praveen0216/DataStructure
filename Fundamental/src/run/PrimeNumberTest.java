package run;

import utils.NumberUtil;

import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumberTest {

    public static void main(String[] args) {
        /*for(int i = 0; i <= 100; i++) {
            System.out.println("number " + i + " is prime ? " +  NumberUtil.isPrimeNumber(i));
        }*/
        List<Integer> numberList = IntStream.rangeClosed(0, 100).boxed().toList();
        numberList.stream().filter(NumberUtil::isPrimeNumber).forEach(System.out::println);
    }
}
