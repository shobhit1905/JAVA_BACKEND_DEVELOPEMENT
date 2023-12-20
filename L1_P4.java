package Inherit1;

class Base 
{
    int x ;

    Base()
    {
        x = 10 ;
        System.out.println("Base default constructor") ;
    }

    Base(int x)
    {
        this.x = x ;
        System.out.println("Base parameterised constructor") ;
    }
}

class Derived extends Base
{
    int a ;

    Derived()
    {
        a = 21 ;
        System.out.println("Derived default constructor") ;
    }

    Derived(int a,int b)
    {
        super(b) ;
        this.a = a ;
        System.out.println("Derived parameterised constructor") ;
    }
}
public class L1_P4 {
    public static void main(String[] args) {
        //Derived d1 = new Derived() ;
        //Derived d2 = new Derived(89,65) ;

    }
}
