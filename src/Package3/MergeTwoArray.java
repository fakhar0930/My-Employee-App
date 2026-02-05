package Package3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MergeTwoArray {

    public static int[] mergeSortedArray(int [] array1,int [] array2){
        int[] result= new int[array1.length+ array2.length];

        int n= array1.length;;
        int m= array2.length;;
        int k =0;
        int a=0;
        int b=0;

        while (a<n && b<m){
            if (array1[a]<array2[b]){
                result[k]=array1[a];
                a++;
                k++;
            } else {
                result[k]=array2[b];
                b++;
                k++;
            }

        }

        while (b<m){
            result[k]=array2[b];
            k++;
            b++;
        }

        while (a<n){
            result[k]=array1[a];
            a++;
            k++;
        }

        return result;
    }


    public static void main(String[] args) {
        int [] array1= {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29};
        int [] array2= {2,4,6,8,10,12,14,16,18};

        List<Integer> Integers =  Arrays.stream(mergeSortedArray(array1,array2)).boxed().collect(Collectors.toList());

        System.out.println(Integers);


        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Fakhar");
        map.put(2,"Nabeel");
        map.put(3,"Naviiin");
        map.put(4,"ShahnawaZ");
        map.put(5,"Manmohan");
        map.put(6,"Anubhav");
        map.put(7,"Ankush");

//        map.forEach((key,value)->{
//            if (key%2!=0){
//                map.put(key,"Distinguished");
//            }
//        });


        map.forEach((key,Value)-> System.out.println(key + " -> " + Value));

    }
}
