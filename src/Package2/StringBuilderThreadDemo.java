package Package2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class StringBuilderThreadDemo {

    public String getName(String name){
        return "Faklhar";
    }

    public static void main(String[] args) throws InterruptedException {

        StringBuilder sb = new StringBuilder();  // shared by both threads

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                sb.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                sb.append("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sb.length());  // EXPECTED: 2000  (1000 A + 1000 B)
        System.out.println(sb.toString()); // But result is unpredictable


        Deque<Integer> queue = new ArrayDeque<Integer>();
        queue.add(5);
        queue.add(2);
        queue.add(8123);
        queue.add(13);
        queue.add(665);
        queue.add(21);
        queue.add(86);
        queue.add(2345);

        queue.offer(99);
        queue.poll();
        queue.poll();
//        queue.poll();


        System.out.println(queue.offerFirst(13));
        System.out.println(queue);

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.offerFirst("A");  // Inserts at front
        deque.offerLast("B");   // Inserts at end
        deque.offer("C");       // Also inserts at end

        System.out.println(deque); // Output: [A, B, C]


        String s = "Fakhar";

        String s2= "Fakhar";
        System.out.println(s.equalsIgnoreCase("fAkHaR"));

        System.out.println(s.compareToIgnoreCase(s2));

        System.out.println(s.toUpperCase().equals(s2.toUpperCase()));
        System.out.println(s.equals(s2));

    }
}
