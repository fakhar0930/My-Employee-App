package Package2;

public class InterfaceIMPL implements  Interface2, Interface1{


    public void localMethod(){
        System.out.println("Local Method");
    }




//    public void method6() {
//        System.out.println("Interface Tutorial Interface2");
//
//    }

    @Override
    public void method7() {
        System.out.println("Interface Tutorial");
    }

    @Override
    public void method8() {
        System.out.println("Interface Tutorial");
    }

    @Override
    public void method9() {
        System.out.println("Interface Tutorial");
    }

    @Override
    public void method10() {
        System.out.println("Interface Tutorial");
    }

    @Override
    public void method11() {
        System.out.println("Interface Tutorial");
    }

    @Override
    public void draw() {
        System.out.println("Draw Method");
    }

    @Override
    public String getMessage() {
        return Interface1.super.getMessage();
    }

    public static void main(String[] args) {
        InterfaceIMPL interfaceIMPL = new InterfaceIMPL();
//        interfaceIMPL.method1();
        interfaceIMPL.localMethod();

        Interface1.staticNethod("Fakhar");
        System.out.println(Interface1.staticNethod("Fakhar"));

        InterfaceIMPL interfaceIMPL1 = new InterfaceIMPL();
        interfaceIMPL1.draw();

        System.out.println(interfaceIMPL1.getMessage());


//        System.out.println(interfaceIMPL1.draw());
        interfaceIMPL1.draw();
    }
}
