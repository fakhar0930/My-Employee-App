package Package1;

import java.util.function.Consumer;

public class ConsumerClass {
    public static void main(String[] args) {
        Consumer<Integer> consumer= x-> System.out.println(x);
        consumer.accept(51);
    }
}
