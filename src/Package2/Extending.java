package Package2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Extending  extends StringBuilderThreadDemo {
    @Override
    public String getName(String name) {
//        //return name;
//        return "Fakkkkkhar";
        return super.getName(name);
    }


    public static void main(String[] args) {
        Extending extending = new Extending();
        System.out.println(extending.getName("Mushtaq"));


        List<Integer> list = Arrays.asList(1, 2, 212, 242, 213, 4, 5, 5, 35, 52, 55, 36, 78838, 8, 34, 324356, 346);


        Double average = list.stream().mapToInt(x -> x).average().getAsDouble();
        System.out.println("Average: " + average);
        Integer sum = list.stream().mapToInt(x -> x).sum();
        System.out.println("Sum: " + sum);

        List<Integer> distinctList = list.stream().distinct().toList();
        System.out.println("Distinct List: " + distinctList);

        Map<String, List<Integer>> oddEvenMap = list.stream().collect(
                java.util.stream.Collectors.groupingBy(
                        x -> x % 2 == 0 ? "Even" : "Odd"
                )
        );
        System.out.println(oddEvenMap);

        List<Integer> printNumberThatStartsWith2 = list.stream()
                .map(Object::toString)
                .filter(x -> x.startsWith("2"))
                .map(Integer::valueOf)
                .toList();
        System.out.println(printNumberThatStartsWith2);

        Integer max = list.stream().max(Integer::compareTo).orElseThrow();
        System.out.println("Max: " + max);

        Integer min = list.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("Min: " + min);

        List<Integer> integers = list.stream().sorted().toList();
        System.out.println("Sorted List: " + integers);

        List<Integer> reversedList = list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .toList();
        System.out.println("Reversed List: " + reversedList);

        List<Integer> duplicateNumbers = list.stream()
                .filter(i -> list.indexOf(i) != list.lastIndexOf(i))
                .distinct()
                .toList();
        System.out.println("Duplicate Numbers: " + duplicateNumbers);

        Integer secondLowest = list.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println(secondLowest);

        Integer secondHighest = list.stream()
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println(secondHighest);

        Integer uyerhj = list.stream().skip(5).findFirst().orElseThrow();
        System.out.println(uyerhj);

        StringBuffer sb = new StringBuffer();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sb.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sb.append("B");
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sb.append("C");
            }
        });

        t2.start();
        t3.start();
        t1.start();
        ;


        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Length of String After Threading:  " + sb.length());
        System.out.println(sb);

        //11, 18, 20, 24, 85, 66, 13


        int[] arr1 = {3, 2, 5, 7};
        int[] arr2 = {2, 3, 5, 7};


        boolean compareArrays = Arrays.equals(arr1, arr2);

        System.out.println(compareArrays);

//        8. I need to compare if two arrays are same, but the order does not matter, just compare the elements in arr1 to elements in arr2
//        a. arr1 = [3, 2, 5, 7]
//        b. arr2 = [2, 3, 5, 7]
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean compareArrays2 = Arrays.equals(arr1, arr2);


        System.out.println(compareArrays2);


        String str = "mvi%%oe61!#@*(#nnm,@^@(&*@*(";

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]{2,3}");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            //System.out.println("Special Character: " + matcher.group());
        }

        Map<Integer, String> map = new IdentityHashMap<>();


        //System.out.println(map.size());

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                map.put(i, "Value" + i);
            }
        });

        Thread t5 = new Thread(() -> {
            for (int i = 100; i < 200; i++) {
                map.put(i , "Value" + i );
            }
        });


        t4.start();
        t5.start();

        try {
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        System.out.println(map);
        System.out.println(map.size());

        BigDecimal bigDecimal = new BigDecimal("1.2");
        BigDecimal bigDecimal1 = new BigDecimal("1.3");
        System.out.println(bigDecimal1.add(bigDecimal));


        BigInteger hugeNumber = new BigInteger("1000000000000000000000000");
        BigInteger hugeNumber1 = new BigInteger("200000000000000000000");
        System.out.println(hugeNumber.multiply(hugeNumber1));


        byte b = 127;
        System.out.println(b++);
        long  long1= 123456789l;
        long  long2= 56789l;

        float f= 187546564456.8479f;

        float f2 = 3.2f;

        System.out.println(f*f2);

        System.out.println(long1*long2);







    }
}
