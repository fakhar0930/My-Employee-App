package Package1;

import java.util.function.Predicate;

public class PredicateClass {

    public static void main(String[] args) {
        String s= "Ankit";
        String y = "Fakhar";

        Predicate<String> predicate = x->x.startsWith("A");


        System.out.println(predicate.test(s));
        System.out.println(predicate.test(y)            );
    }
}
