package Package1;

import java.util.LinkedHashSet;
import java.util.Set;

public class NumberPyramidPattern {

    public static String message(int i){
        if (i>10){
            return "Inside IFFF MEthod";
        }
        else {
            return "Outside IFFFF";
        }
    }




    public static void main(String[] args) {

        int number=0;
        int rows=5;


        for (int i=1;i<=rows;i++){
            for (int j=0;j<i;j++){
                number++;
                System.out.print(number+ " ");
            }
            System.out.println();

        }


        Set<String> set = new LinkedHashSet<>();

        set.add("Fakhar");
        set.add("Qureshi");
        set.add("Nabeel");
        set.add("syjdhvc");


        System.out.println(set.add("Fakhar"));
        System.out.println(set.add("Raaahish"));


        System.out.println(set);

        Day day = Day.MONDAY;

        System.out.println(day);

        int i=9;
        System.out.println(message(i));;





    }
}
