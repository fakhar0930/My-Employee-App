package Package1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ABC {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Fakhar","Kareena","Kareena","Iqbaal","Shahnaaz","Nabeel","Sanobar","Badrun");
        List<String> stream = list.stream().filter(x->x.length()>6).distinct().sorted().collect(Collectors.toList());
        System.out.println(stream);
        List<String> stream1 = list.stream().filter(x->x.length()>6).sorted((a,b)->a.length()-b.length()).limit(4).collect(Collectors.toList());
        System.out.println(stream1);



    }
}
