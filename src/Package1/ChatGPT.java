package Package1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ChatGPT {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "strawberry","avocado");

        Optional<Integer> integer=strings.stream().map(String::length).max(Integer::compareTo);
        System.out.println(integer.get());

        List<Integer> integers= Arrays.asList(10, 60, 30, 80, 50, 90,92);
        int sorted = integers.stream().reduce(0,(a, b)->a+b);
        System.out.println(sorted);

        long count = integers.stream().filter(x->x>50).count();
        System.out.println(count);

        List<String> str = strings.stream().filter(x->x.startsWith("a")).limit(1).collect(Collectors.toList());
        System.out.println(str);

        OptionalDouble optionalDouble= integers.stream().mapToInt(Integer::intValue).average();
        System.out.println(optionalDouble.getAsDouble());



    }
}
