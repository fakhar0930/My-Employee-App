package Package1;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


        String userID= UUID.randomUUID().toString();
        System.out.println(userID);

        String userID1 ="0cfb6c4b-af88-4b27-b1f1-0e29df98cacf";

        System.out.println(userID1);

        System.out.println(userID1.equals("0cfb6c4b-af88-4b27-b1f1-0e29df98cacf"));


        String s5= "    Fakhar Qur'eshi     ";
        String trimm=s5.trim();

        System.out.println(trimm);
        System.out.println(trimm.length());

        String[] strings1 = s5.split("\\W+");

        for (String s:strings1){
            System.out.println(s);
        }

        String [] ahsh= {"1","0.12","-100"};


        StringBuilder stringBuilder = new StringBuilder("Fakhar Quareshiar");
//        System.out.println(stringBuilder.replace(1,3,"MMM"));
////        System.out.println(stringBuilder.reverse());
//        System.out.println(stringBuilder.append(" Nabeel"));
////        System.out.println(stringBuilder.delete(1,4));

        System.out.println(stringBuilder.indexOf("a"));
//
//        for (int i=0;i<55;i++){
//            System.out.println(stringBuilder.append("R"));
//        }


        System.out.println(stringBuilder.lastIndexOf("ar"));

        System.out.println(stringBuilder.capacity());


        int [] array={6,8,452,34,2,367,2,253,89,453};

        int min=array[0];

        for (int i=0;i< array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }

        System.out.println(min);

        int secondLargest = Arrays.stream(array)
                .distinct() // remove duplicates
                .boxed()    // needed for reverseOrder comparator
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Array too small"));


        System.out.println(secondLargest);

        String snm= "The quick brown fox jumps over the lazy dog";

        Map<Character,Integer> hashMap = new LinkedHashMap<>();

        for (int i=0;i<snm.length();i++){
            if (snm.charAt(i)!=' ') {
                if (hashMap.containsKey(snm.charAt(i))) {
                    hashMap.put(snm.charAt(i), hashMap.get(snm.charAt(i)) + 1);
                    //System.out.println("Reapeated Character: "+ snm.charAt(i));
                } else hashMap.put(snm.charAt(i), 1);
            }
        }
        System.out.println(hashMap);

        System.out.println(hashMap.get('e'));


        String rev= "Fakhar";

        Stack<Character> stack = new Stack<>();

        for (int i=0;i<rev.length();i++){
            stack.push(rev.charAt(i));
        }

        System.out.println(rev);

        for (int i=stack.size()-1;i>=0;i--){
            System.out.print(stack.elementAt(i));
        }

        System.out.println();


        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list.size());

        System.out.println("Linked List: " + list);

        list.add(0,20);

        System.out.println("Linked List: " + list);

        int[] array1 ={6,8,452,34,2,367,2,253,89,453};

        System.out.print("Unsorted Array: ");
        for ( int i :array1){
            System.out.print(i + " ");
        }

        System.out.println();
        Arrays.sort(array1);

        System.out.print("sorted Array: ");

        for ( int i :array1){
            System.out.print(i + " ");
        }
        System.out.println();

        Stack<Character> stack1= new Stack<>();
        stack1.push('a');
        stack1.push('b');
        stack1.push('c');
        stack1.push('d');
        stack1.push('e');
        stack1.push('f');
        stack1.push('g');


        while (!stack1.isEmpty()){
            System.out.print(stack1.pop());
        }
        System.out.println();


        String stir= "FAKHAR";

        Deque<Character> characters = new ArrayDeque<>();

        for (int i=0;i<stir.length();i++){
            characters.add(stir.charAt(i));
        }

        characters.addFirst('Q');
        characters.addLast('N');



        System.out.println(characters);

        while (!characters.isEmpty()){
            System.out.print(characters.poll() + "_");
        }
        //anagram margana

        System.out.println();

        String a="StUDy";
        String b ="dUsty";

        a=a.toLowerCase();
        b=b.toLowerCase();

        System.out.println(a);

        Map<Character,Integer> map1= new HashMap<>();
        for (int i=0;i<a.length();i++){
            if (map1.containsKey(a.charAt(i))){
                map1.put(a.charAt(i), map1.get(a.charAt(i))+1);
            } else map1.put(a.charAt(i),1);
        }

        System.out.println(map1);


        Map<Character,Integer> map2= new HashMap<>();
        for (int i=0;i<b.length();i++){
            if (map2.containsKey(b.charAt(i))){
                map2.put(b.charAt(i), map2.get(b.charAt(i))+1);
            } else map2.put(b.charAt(i),1);
        }

        System.out.println(map2);
        System.out.println("Size: " + map1.size() + " Size 2 : "+ map2. size() );

        int count=0;
        if (map2.size()==map1.size()){
            for (int i=0;i<a.length();i++){
                if (map1.get(a.charAt(i))==map2.get(a.charAt(i))){
                    count++;
                }
            }
        }
        System.out.println("Count= "+ count);


        //map2.put('d',map2.getOrDefault('d',0)+1);

        boolean br= false;
        if (count==a.length()){
            br=true;
        }

        System.out.println("Map1: " + map1);
        System.out.println("Map2: " + map2);

        System.out.println(br);

    }
}
