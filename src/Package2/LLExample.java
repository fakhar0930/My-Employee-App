package Package2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LLExample {


    int rollNum;
    String name;
    Double percentage;
    char section;

    @Override
    public String toString() {
        return " {rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", section=" + section +
                '}';
    }

    public LLExample(int rollNum, String name, Double percentage, char section) {
        this.rollNum = rollNum;
        this.name = name;
        this.percentage = percentage;
        this.section = section;
    }

    //    int[] array={1,2,3,4,5,6,7};
    public static int binarySearch(int[] arr,int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {



        int[] array={1,22,6,6,7,3,4,22,5,6,7};


        System.out.println(binarySearch(array,5));

        Set<Integer> set= new HashSet<>();

        for (int i=0;i< array.length;i++){
            if (!set.add(array[i])){
                System.out.println("Duplicates Found: " + array[i]);
            }
        }

        System.out.println(set);


        set.remove(22);

        System.out.println(set);

        List<Integer> integers =  set.stream().collect(Collectors.toList());

        System.out.println(integers);


        List<Integer> integerList = Arrays.asList(1,2,3,4,5,67,8,3,42,5,35,5,36,3747);

        Map<String,List<Integer>> oddEven= integerList.stream()
                .collect(Collectors.groupingBy(x-> x> 42 ? "More than 42: " : "Less Than 42: "));

        System.out.println(oddEven);

        LLExample llExample = new LLExample(1,"Fakhar",55.5,'A');
        LLExample llExample1 = new LLExample(2,"Navin",87.0,'B');
        LLExample llExample2 = new LLExample(3,"Kanhaiyar",98.5,'A');
        LLExample llExample3 = new LLExample(4,"Manmohan",45.0,'C');
        LLExample llExample4 = new LLExample(5,"Ankush",99.99,'B');
        LLExample llExample5 = new LLExample(6,"Shahnawaz",89.23,'A');




        List<LLExample> list = new ArrayList<>();
        list.add(llExample);
        list.add(llExample1);
        list.add(llExample2);
        list.add(llExample3);
        list.add(llExample4);
        list.add(llExample5);

        Map<Character,List<LLExample>> filteredList= list
                .stream()
                .collect(Collectors.groupingBy(x->x.section));

        System.out.println(filteredList);


        int[] array1= {3,5525,6,3,3,3,3,4,5,5,5,5,3,1,33,4141,4,43,534,464,6,663};

        int target=54;
        int start=0;
        try {
            while (true){
                if (array1[start]==target){
                    System.out.println("FOund at Index: " + start);
                    break;
                }
                start++;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Not Found in the Array: ");
        }

        List<String> name1=Arrays.asList("Fakhar", "Nabeel","Navin","Kanhaiyalal","Asma"
                ,"Shahnaaz","IqbaalHussain","Kareena","Fayza");
        List<String> name2 =Arrays.asList("Uda","Mangu","Kanha");

        Map<Integer,List<String>> filteredList1= name1.stream().collect(Collectors.groupingBy(x->x.length()));

        System.out.println(filteredList1);

        Iterator<Map.Entry<Integer, List<String>>> iterator =
                filteredList1.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, List<String>> entry = iterator.next();
            System.out.println(entry.getKey() + " Letters = " + entry.getValue());
        }

        List<List<String>> falttenedList= new ArrayList<>();

        falttenedList.add(name1);
        falttenedList.add(name2);

        List<String> liist
                = falttenedList.stream().flatMap(x->x.stream()).filter(x->x.toLowerCase().startsWith("f")).collect(Collectors.toList());

        System.out.println(liist);


        int[] array3 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        //Code for merging two arrays into a single List of Integer

        List<Integer> result = IntStream
                .concat(Arrays.stream(array3), Arrays.stream(array2))
                .boxed()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
        // Output: [1, 2, 3, 4, 5, 6, 7, 8]

        String exam= "racecar";

        char[] chars= exam.toCharArray();

        Set<Character> set1= new HashSet<>();
        List<Character> set2= new ArrayList<>();

        for (char c:chars){
            set2.add(c);
            set1.add(c);
        }

//        System.out.println(Arrays.toString(array2));


        int[] arr = {1,2,7,2,4,35,6,67,7,683,4,5,6,7,8,9};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int thirdHighest= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                thirdHighest=secondHighest;
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] != highest) {
                thirdHighest=secondHighest;
                secondHighest = arr[i];
            } else if (arr[i] > thirdHighest && arr[i] != secondHighest && arr[i] != highest){
                thirdHighest=arr[i];
            }
        }

        System.out.println("Highest element: " + highest);
        System.out.println("Second highest element: " + secondHighest);
        System.out.println("Third highest element: " + thirdHighest);

        List<String> streamsList= Arrays.asList("Fakhar","Nabeel","Sanobar","SHahnaaz","Badrun");

        streamsList
                .stream()
                .map(String::toUpperCase)
                .filter(x->x.startsWith("F"))
                .forEach(System.out::println);







    }
}
