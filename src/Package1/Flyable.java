package Package1;

public interface Flyable {


    public String makeSound(String a, String b);


    static void sleep(){
        System.out.println("Animal is Sleeping");
    }

    default void fly(){
        System.out.println("Bird is Flying");
    }

}

class Implement implements Flyable{


    public static void main(String[] args) {
        Implement implement = new Implement();
        implement.fly();
        implement.makeSound();

        Flyable implement1 = (a,b) -> a + b ;
        String string= implement1.makeSound("Fakhariii " , "Qureshi");
        System.out.println(string);
    }

    public void makeSound() {
        System.out.println("Implementation of Make Sound Method");
    }


    @Override
    public String makeSound(String a, String b) {
        return null;
    }

    static void sleep(){
        System.out.println("Animal is Sleeping in Package1.Implement");
    }


}
