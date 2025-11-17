package Package2;

public class InterfaceIMPL implements  Interface2, Interface1{


    public void localMethod(){
        System.out.println("Local Method");
    }

    @Override
    public void method1() {

        System.out.println("Interface Tutorial");
    }

    @Override
    public void method2() {
        System.out.println("Interface Tutorial");
    }

    @Override
    public void method3() {
        System.out.println("Interface Tutorial");
    }

    @Override
    public void method4() {
        System.out.println("Interface Tutorial");
    }

    @Override
    public void method5() {
        System.out.println("Interface Tutorial");
    }

    @Override
    public void method6() {
        System.out.println("Interface Tutorial");

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

    public static void main(String[] args) {
        InterfaceIMPL interfaceIMPL = new InterfaceIMPL();
        interfaceIMPL.method1();
        interfaceIMPL.localMethod();
    }
}
