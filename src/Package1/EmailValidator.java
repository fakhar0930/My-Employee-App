package Package1;

import java.io.*;
import java.util.regex.*;

public class EmailValidator {
    public static void main(String[] args) {
        // Step 1: Create and write some emails to fakhar.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("fakhar.txt"))) {
            writer.write("fakhar@gmail.com\n");
            writer.write("wrong-email@@example..com\n");
            writer.write("hello.world@yahoo.com\n");
            writer.write("user@domain\n");
            writer.write("admin@openai.com\n");
            System.out.println("Emails written to fakhar.txt successfully!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 2: Read emails and validate them
        String email = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("fakhar.txt"));
             BufferedWriter resultWriter = new BufferedWriter(new FileWriter("email_status.txt"))) {

            Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

            while ((email = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(email.trim());
                if (matcher.matches()) {
                    resultWriter.write(email + " - VALID\n");
                } else {
                    resultWriter.write(email + " - INVALID\n");
                }
            }

            System.out.println("Validation complete! Check 'email_status.txt' for results.");

        } catch (IOException e) {
            e.printStackTrace();
        }


        String sentence = "My phone numbers are 03211234567 and 03105551234";
        char[] chars = sentence.toCharArray();
        String[] strings = sentence.split("//W+");
        System.out.println(chars);

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " S");
        }
        System.out.println();
        String sentence1 = "My phone numbers are 03211234567 and 03105551234";

        // Split by spaces
        String[] words = sentence1.split("\\s+"); // \s+ = one or more spaces

        // Print the array
        for (String word : words) {
            System.out.println(word);
        }


        String emailRegex = "^[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+" +
                "(\\.[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+)*" + // local part dots
                "@" +
                "([A-Za-z0-9]+(-[A-Za-z0-9]+)*\\.)+" +    // domain labels
                "[A-Za-z]{2,}$";


        email="fak######^&$*($(*@gmail.com";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()){
            System.out.println("Pattern Match");;
        } else System.out.println("Pattern Doesnt Match");
    }
}
