package Package1;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamLambdaDemo {

    public static void main(String[] args) {
        basicLambdas();
        streamExamples();
        functionalInterfacesExamples();
        customObjectStream();
    }

    // ---------------------------
    // 1️⃣ Basic Lambda Examples
    // ---------------------------
    private static void basicLambdas() {
        System.out.println("\n=== 1. Basic Lambda Examples ===");

        Runnable helloTask = () -> System.out.println("Hello from a Lambda Runnable!");
        helloTask.run();

        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
        names.sort((a, b) -> a.compareToIgnoreCase(b));
        System.out.println("Sorted names: " + names);
    }

    // ---------------------------
    // 2️⃣ Stream API Examples
    // ---------------------------
    private static void streamExamples() {
        System.out.println("\n=== 2. Stream API Examples ===");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Filter even numbers and square them
        List<Integer> evenSquares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Even squares: " + evenSquares);

        // Sum using reduce
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
    }

    // -----------------------------------------
    // 3️⃣ Functional Interface Examples
    // -----------------------------------------
    private static void functionalInterfacesExamples() {
        System.out.println("\n=== 3. Functional Interface Examples ===");

        // Predicate<T> → test a condition
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Function<T, R> → transform data
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'Lambda': " + stringLength.apply("Lambda"));

        // Consumer<T> → consume data (no return)
        Consumer<String> printer = s -> System.out.println("Consumed: " + s);
        printer.accept("Hello Consumer!");

        // Supplier<T> → provide data (no input)
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());

        // UnaryOperator<T> → Function where input = output type
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // BinaryOperator<T> → Function with two same-type inputs
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Sum (BinaryOperator): " + add.apply(3, 7));
    }

    // -----------------------------------------
    // 4️⃣ Stream with Custom Objects
    // -----------------------------------------
    private static void customObjectStream() {
        System.out.println("\n=== 4. Stream with Custom Objects ===");

        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 22),
                new Person("Charlie", 25),
                new Person("David", 35),
                new Person("Amanda", 27)
        );

        // Use Predicate with streams
        Predicate<Person> ageAbove25 = p -> p.age > 25;

        // Use Function to map from Person to String (name)
        Function<Person, String> getName = p -> p.name;

        // Combine Stream + Predicate + Function
        List<String> namesAbove25 = people.stream()
                .filter(ageAbove25)
                .map(getName)
                .collect(Collectors.toList());

        System.out.println("People older than 25: " + namesAbove25);

        // Use Consumer to print each person
        Consumer<Person> showPerson = p ->
                System.out.println(p.name + " (" + p.age + " years old)");
        people.forEach(showPerson);
    }

    // -----------------------------------------
    // Helper Class
    // -----------------------------------------
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
