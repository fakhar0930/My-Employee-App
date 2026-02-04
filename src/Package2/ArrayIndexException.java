package Package2;

import java.util.HashMap;
import java.util.Map;

public class ArrayIndexException  extends  Exception{

    public ArrayIndexException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Fakhar");
        map.put(2,"Sanobar");
        map.put(3,"KAreena");
        map.put(4,"SHahnaaz");
        map.put(5,"Naveen");


        System.out.println(map.getOrDefault(6,"Hanzala"));

        System.out.println(map);


    }
}
