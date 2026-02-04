package Package2;

import java.sql.Statement;

interface Interface1 {

    void draw();

    default String getMessage(){
     return "Default Method in INterface";
    }
    static String staticNethod(String name){
     return name;
    }




}
