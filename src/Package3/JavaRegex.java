package Package3;

public class JavaRegex {

    public static void main(String[] args) {

        String s = "  ^!^@^72177948y^893488&F^&@^^#^**#&&(@aKhar      ";

        s= s.trim();
        System.out.println(s);

        s = s.replaceAll("\\W", "");

        System.out.println(s);

    }
}
