package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args){
        B bobj= new B();
        C cobj= new C();

        System.out.println("calling b methid display");
        bobj.display();
        System.out.println("calling c method display");
        cobj.display();
    }
}
/*calling b methid display
the protected variable value is11
the public variable value is13
calling c method display
the public variable value is13*/
