package Package1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileClass {
    public static void main(String[] args) {


        String[] sentences = {
                "Java is a versatile programming language.",
                "File I/O lets you read and write data to files.",
                "BufferedReader and BufferedWriter are efficient for text files.",
                "Practice makes perfect, especially with streams.",
                "Did you know? Java was originally called Oak.",
                "2025 is going to be an exciting year for technology!",
                "Remember to always close your streams.",
                "Appending text is easy once you know how.",
                "Exceptions like IOException must be handled.",
                "Learning by doing is the best approach!"
        };

        List<String> strings = Arrays.asList(
                "I scream, you scream, we all scream for ice cream!",
                "Why did the chicken cross the road? To get to the other side!",
                "She sells seashells by the seashore.",
                "Peter Piper picked a peck of pickled peppers.",
                "A quick brown fox jumps over the lazy dog.",
                "To be or not to be, that is the question."
        );


        try (
                BufferedWriter writers = new BufferedWriter(new FileWriter("fakharqureshi.txt"))){
                for (String fruit : strings) {
                    writers.write(fruit);
                    writers.newLine();
                };


        } catch (IOException e){
            System.out.println(e);
        }




        try (
            BufferedWriter writer = new BufferedWriter(new FileWriter("fakharqureshi.txt",true))){
            for (String i: sentences){
                writer.write(i);
                writer.newLine();
            }

        } catch (IOException e){
            System.out.println(e);
        }

        List<String[]> charList= new ArrayList<>();


        try(BufferedReader reader = new BufferedReader(new FileReader("fakharqureshi.txt"))) {

            String line;
            while ((line=reader.readLine())!=null){

                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println(e);
        }

//        for (int i=0;i<charList.size();i++){
//            for (int j=0;j<charList.get(i).length;j++){
//                System.out.println(charList.get(i)[j]);
//            }
//        }

    }
}
