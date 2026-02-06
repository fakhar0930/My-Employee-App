package Package3;

import com.sun.jdi.request.BreakpointRequest;

public record RecordsExample(String name, int age, int phone, double balance){
    @Override
    public String toString() {
        return
                "[name=" + name +
                ", age=" + age +
                ", phone=" + phone +
                ", balance=" + balance +
                "]";
    }
}

class Main{
    public static void main(String[] args) {
     RecordsExample recordsExample = new RecordsExample("John Doe",27,35664,23587.25);

        System.out.println(recordsExample.age());
        System.out.println(recordsExample.name());
        System.out.println(recordsExample.balance());
        System.out.println(recordsExample.phone());

        System.out.println(recordsExample);





    }
}
