package Inherit1;

// We can create a base class refernce to the object of derived class , this is known as Dynamin Method Dispatch
/* When we create a refernce of base class refering to the object of derived class , the only methods that are overridden by the derived class is called , if more  methods are 
   present we can only call them by the object of derived class . 
*/
// static methods cannot be overriden because they are class methods 
class Base1
{
    void print()
    {
        System.out.println("This is a base class method");
    }

    static void dis()
    {
        System.out.println("base class display");
    }
}

class Derived1 extends Base1
{
    @Override
    void print()
    {
        System.out.println("This is a derived class method");
    }

    static void dis()
    {
        System.out.println("derived class display");
    }
}
public class L1_P6 {
    public static void main(String[] args) {
        Base1 b1 = new Base1() ;
        Derived1 d1 = new Derived1() ;

        b1.print();
        d1.print(); 

        // Base1 obj = new Derived1() ;
        // obj.dis();
    }
}
