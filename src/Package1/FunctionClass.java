package Package1;

import java.util.function.Function;

public class FunctionClass {

    public static void main(String[] args) {


        String s = "Fakhar QUreshiiii";
        Function<String,Integer> function= x->x.length();
        System.out.println(function.apply(s));

    }


}
