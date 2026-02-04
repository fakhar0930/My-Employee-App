package Package2;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class MyRegex {

    public static void main(String[] args) {

        String pattern = "batman123";
        try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (Exception e) {
            System.out.println("Invalid");
        }


    }

}
