package Package2;

public class Bike {

    String name;

    public Bike(String name, boolean print) {
        this.name = name;
        if (print) {
            System.out.println("Bike Created");
        }
    }

    public Bike(String name) {
        this(name, true); // default: print
    }

    public String returnLength() {
        return "Length Bike = " + name.length();
    }

    @Override
    public String toString() {
        return "Bike{name='" + name + "'}";
    }

    public static void main(String[] args) {
        Bike bike = new Bike("Honda CBR");
//        System.out.println(bike);
        System.out.println( bike.returnLength());

        Bike bike1 = new Scooter("Vespa 500D");
        System.out.println(bike1.returnLength());
    }
}

class Scooter extends Bike {

    public Scooter(String name) {
        super(name, false); // DO NOT PRINT
    }
    @Override
    public String returnLength() {
        return "Length Scooter = " + (name.length() + 1);
    }
}
