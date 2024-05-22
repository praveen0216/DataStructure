package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<String>  names =  new ArrayList<>();
        names.add("abcc");
        names.add("abcghhc");
        names.add("abfthnyfcc");
        names.add("absaeesvvcc");
        names.add("acc");

        sortBasedOnLength(names);

    }

    private static void sortBasedOnLength(List<String> names) {

        Comparator<String> ascending = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            } else {
                return 0;
            }
        };



        names.sort(ascending);
        names.forEach(System.out::println);


        Map<String, Integer> collect = names.stream().collect(Collectors.toMap(Function.identity(), s-> s.length()));
       System.out.println(collect);
    }
}
