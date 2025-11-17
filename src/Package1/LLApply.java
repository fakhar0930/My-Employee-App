package Package1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LLApply {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        long starttime= System.currentTimeMillis();
        for (int i=0;i<10000000;i++){
            arrayList.add(i);
        }
        long endtime= System.currentTimeMillis();

//        System.out.println(starttime);
//        System.out.println(endtime);

        long actualTime= endtime-starttime;
        System.out.println("ArrayList Add Time: " + actualTime);
        System.out.println("Fakhar Qureshi");

        List<Integer> linkedList= new LinkedList<>();
        starttime= System.currentTimeMillis();
        for (int i=0;i<10000000;i++){
            linkedList.add(i);
        }
        endtime= System.currentTimeMillis();
        actualTime= endtime-starttime;

        System.out.println("LinkedList Add Time: " + actualTime);

        System.out.println("_______________________________________");

        starttime= System.currentTimeMillis();
        System.out.println(starttime);
        //System.out.println(arrayList.get(9999998));
        arrayList.remove(999999);
        endtime= System.currentTimeMillis();
        System.out.println(endtime);
        actualTime= endtime-starttime;

        System.out.println("ArrayList Delete Time: " + actualTime +" ms");
        System.out.println("_______________________________________");

        starttime= System.currentTimeMillis();
        System.out.println(starttime);
        //System.out.println(linkedList.get(9999998));
        linkedList.remove(999999);
        endtime= System.currentTimeMillis();
        System.out.println(endtime);
        actualTime= endtime-starttime;

        System.out.println("LinkedListr Delete Time: " + actualTime+" ms");













    }
}
