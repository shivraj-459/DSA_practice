package JAVA_Practice.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreateStream {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,5,6,7,1,4,3);

       List<Integer> newList= list.stream()
                .filter(n-> n%2==1)
                .sorted()
                .map(n-> n*2)
                .collect(Collectors.toList());

       System.out.println(newList);
    }
}
