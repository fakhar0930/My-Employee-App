package Package1;

import java.util.SortedMap;

public class PasswordEncoder {

    public static void doThrow(int i) throws Exception {

        int g=0;
            int m=i/g;
            System.out.println("Ran Successfully");




    }

    public static void main(String[] args)  {

//        doThrow(5);
        System.out.println(5/0);
        int[] array= new int[20];
        for (int i=0;i< array.length;i++){
            array[i]=i*2;
        }



        for (int i : array){
            System.out.println(i);
        }



    }
}
