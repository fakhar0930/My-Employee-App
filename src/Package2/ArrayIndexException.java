package Package2;

import java.util.HashMap;
import java.util.Map;

public class ArrayIndexException  extends  Exception{

    public ArrayIndexException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        int a =10;
        int b=0;

        try {
            if (b==0){
                throw  new ArrayIndexException("Error:  B Is Zero");
            }
           int c= a/b;
        } catch (ArrayIndexException e){
            System.out.println(e.getMessage());
        }

        Thread t = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("T1 Count: " + i);
            }
        });
        t.start();
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("T2 Count: " + i);
            }
        });
        t2.start();



    }


}
