package Package2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Palindrom {

    public static boolean checkPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        //ABCBA
        //ABCCBA

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        System.out.println("String " + s + " is Palindrome");
        return true;


    }

    public static int factorial(int n) {

        int factorial = 0;
        int factor = n * n - 1;
        factorial = factorial + factor;

        if (n <= 0) {
            return factorial;
        }
        return factorial(n - 1);
    }


    public static void main(String[] args) {

        String s = "dAbBaD";
        boolean isPalindrome = checkPalindrome(s);

        System.out.println(isPalindrome);


        System.out.println(factorial(4));


        List<Integer> list1 = Arrays.asList(11, 42,7,33,2,422,2,4556,6);

        List<Integer> list2 = Arrays.asList(776, 78, 83, 99, 10);
        List<Integer> list3 = Stream
                .concat(list1.stream(), list2.stream())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(list3);
    }


}