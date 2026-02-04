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
//        System.out.println(5/0);
        int[] array= new int[20];
        for (int i=0;i< array.length;i++){
            array[i]=i*2;
        }



        for (int i : array){
            System.out.println(i);
        }

        // print "Hello World" 10 times
        for (int i=0;i<10;i++){
            System.out.println("Hello World");
        }

        //write code to declare a string and print each character of the string in new line
        String str= "Fakhar";
        for (int i=0;i<str.length();i++) {
            System.out.println(str.charAt(i));
        }


        int i =  5 * 3 + 2 - 4 / 2;
        System.out.println(i);



    }
}
