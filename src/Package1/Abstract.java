package Package1;

abstract class Abstract {


    public void doSum(){
        System.out.println("This is Sum Method");
    }

    static void doDivision(){
        System.out.println("This is Division Method");
    }

    public void dominus(){
        System.out.println("This is Minus Method");
    }

    public abstract void doMultiply();

    public static void main(String[] args) {

        Abstract abs= new Apply();
        abs.doSum();
        abs.dominus();
        abs.doMultiply();

        Abstract.doDivision();
        Apply.doDivision();

    }
}

class Apply extends Abstract {



    @Override
    public void doSum(){
        System.out.println("This is Sum Method But of Package1.Apply Class Overriding");
    }
    @Override
    public void doMultiply() {
        System.out.println("Multiply Method of Package1.Abstract Class");
    }


    static void doDivision(){
        System.out.println("This is Division Method of Package1.Apply Class Overriding");
    }
}