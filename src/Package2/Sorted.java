package Package2;

import java.util.*;
import java.util.stream.Collectors;

public class Sorted {

    public static void main(String[] args) {


        List<String> names= Arrays.asList("Fakhar","Nabeel","Badrun","Sanobar","Apple");

        List<String> reverseOrder = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<String> naturalOrder = names.
                stream().
                sorted().collect(Collectors.toList());

        System.out.println("Names Before:  " +names);
        System.out.println("Names Sorted Natural:  " + naturalOrder);
        System.out.println("Names Sorted Reverse:  " + reverseOrder);

        Stack<Integer> stack = new Stack<>();
        stack.push(13);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(4);
        stack.push(9);

        System  .out.println(stack.peek());


        System.out.println(stack.firstElement());

        System.out.println(stack);
        stack.add(10);
        System.out.println(stack);

        System.out.println(stack.peek());


        String str = "Test Java With Java 8 Test";

        String[] strings= str.split("\\W");

        System.out.println(strings[2]);

        HashSet<String> set = new HashSet<>();
        for (String s : strings){
            if (!set.add(s)){
                System.out.println("Duplicate Word: " +s);
            } else set.add(s);
        }

        List<String> duplicates = Arrays.stream(strings)
                .map(String::toLowerCase) // optional: for case-insensitive comparison
                .collect(Collectors.groupingBy(w -> w, Collectors.counting())) // count occurrences
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1) // only duplicates
                .map(Map.Entry::getKey)        // extract the word
                .collect(Collectors.toList()); // collect to list

        String s = null;
        String s1 = "Java";
        System.out.println(s + " " +s1);

        ArrayList<String> namesString = new ArrayList<>(Arrays.asList(
                "Alice", "Bob", "Charlie", "Diana", "Ethan",
                "Fiona", "George", "Hannah", "Ian", "Julia",
                "Kevin", "Laura", "Michael", "Nina", "Oliver",
                "Patricia", "Quentin", "Rachel", "Samuel", "Tina",
                "Umar", "Victoria", "William", "Xena", "Yara",
                "Zachary", "Aaron", "Bella", "Caleb", "Delia",
                "Elijah", "Felicia", "Gabriel", "Hazel", "Isaac",
                "Jasmine", "Kyle", "Lila", "Mason", "Naomi",
                "Owen", "Penelope", "Quinn", "Riley", "Sophia",
                "Thomas", "Ursula", "Vanessa", "Wyatt", "Zoe"
        ));


        Map<Integer,Long> filtered= namesString.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));

        System.out.println(filtered);






    }
}
