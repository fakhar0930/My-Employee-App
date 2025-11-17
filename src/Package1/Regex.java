package Package1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        String pattern= "\\d{3}-\\d{2}-\\d{4}";
        String num= "123-56-2587";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(num);

        if (matcher.find()){
            System.out.println(matcher.group());
        } else System.out.println("Pattern Not Found");


        pattern= "(fak)[a-zA-Z0-9]{6}";
         num= "fakharqurefakshirdhhjdsncbnfakArZ91";
        pattern1 = Pattern.compile(pattern);
   matcher = pattern1.matcher(num);

        while (matcher.find()){
            System.out.println(matcher.group());
        }


        pattern= "\\d{2}";
        pattern= "\\D{5}";

        String mobNumber="^\\+91[6-9][0-9]{9}$";
        num= "fakharqurefakshirdhhjdsncbnfakArZ91";
        String string= "+919354006442";
        pattern1 = Pattern.compile(mobNumber);
        matcher = pattern1.matcher(string);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
