package Inherit1;

/*
 * Suppose we create a parameterised constructor for every class and then at object creation we re not passing any arguments , i.e , calling a default constructor , the compiler 
 * will give an error , becuase if we have defined a constructor in a class then it is our responsibility to define the default constructor also .
 * If we havent defined any constructor and call for a default constructor the compiler will automatically create a default construct for the class . 
 */
class Parent1
{
    int a , b ;

    // Parent1()
    // {
    //     System.out.println("Parent1's Default Constructor");
    //     a = 10 ;
    //     b = 20 ;
        
    // }

    Parent1(int a , int b)
    {
        System.out.println("Parent1's Parameterized Constructor");
        this.a = a ;
        this.b = b ;
        
    }
}

class Child1 extends Parent1
{
    int x , y ;

    // Child1()
    // {
    //     System.out.println("Child1's Default Constructor") ;
    //     x = 100 ;
    //     y = 200 ;
    // }

    Child1(int x , int y)
    {
        super(x*10,y*21) ;
        System.out.println("Child1's Parameterized Constructor");
        this.x = x ;
        this.y = y ;
    }

    void display()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }

}

class World
{
    String name = "Earth" ;
    void display()
    {
        System.out.println("Name : " + name);
    }
}

public class L1_P3 {
    public static void main(String[] args) {

        Child1 obj = new Child1(10,20) ;
        obj.display();

        // Parent1 p = new Parent1() ;  -? compiler gives an error if we remove the default constructor
        World w = new World() ; // the compiler doesn't give error brecuase no constructor is created by the programmer , the compiler automatically creates a default constructor
        w.display();
    }
}
