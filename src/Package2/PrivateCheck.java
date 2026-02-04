package Package2;

import java.util.*;

public class PrivateCheck {

    private int number;
    private  String string;
    private Double amount;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number)  {
       if (number<100){
           this.number = number;
       } else throw new IllegalArgumentException("number is not valid");
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public  static boolean ifSorted(int []  array){
        for (int i=0;i< array.length-1;i++){
            if (array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        PrivateCheck privateCheck = new PrivateCheck();
        privateCheck.setNumber(99);

        System.out.println(privateCheck.getNumber());



        int [] array= {1,25,2,2,3,4,5,6,7,8,9};
//        Arrays.sort(array);

        System.out.println(ifSorted(array));


        String dsa=" Java is fun and untitldlln3bf;''bbdlnbhk  ";
        dsa=dsa.trim();
        System.out.println(dsa);

        String[] Trim= dsa.split("\\W+");
//        System.out.println(Trim[0]);

        System.out.println(Trim.length);

        for (int i = Trim.length-1;i>=0;i--){
            System.out.println(Trim[i]);
        }

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it = list.iterator();

//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }


        List<String> string = new ArrayList<>();
        string.add("Fakhar");
        string.add("Kaynat");
        string.add("Sanobar");
        string.add("Nabeel");


        ListIterator<String> listIterator = string.listIterator();

        while (listIterator.hasNext()){
            if (listIterator.next()=="Kaynat"){
                listIterator.remove();
            }
        }


        System.out.println(string);

//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
//
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("d", 5);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        Stack<String> stringsstack= new Stack<>();
        stringsstack.push("Fakhar");
        stringsstack.push("Nabeel");
        stringsstack.push("Iqbaal");
        stringsstack.push("Sanobar");
        stringsstack.push("Badrun");
        stringsstack.push("Shaahananaz");
        stringsstack.push("JKayanaat");

//        System.out.println(stringsstack.pop());
//
        System.out.println(stringsstack);


        Iterator<String> iterator= stringsstack.iterator();

        System.out.println("Size: " + stringsstack.size());



        System.out.println("Size: " + stringsstack.size());






    }

}
