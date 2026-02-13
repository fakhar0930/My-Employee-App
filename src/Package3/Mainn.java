package Package3;

// Mainn.java
public class Mainn {
    public static void main(String[] args) {

        // Using the Builder
        User user = new User.Builder()
                .firstName("Ravi")
                .lastName("Kumar")
                .email("ravi@gmail.com")
                .phone("9999999999")
                .age(25)
                .active(true)
                .build();

        // Output values
        System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Phone: " + user.getPhone());
        System.out.println("Age: " + user.getAge());
        System.out.println("Active: " + user.isActive());
    }
}

