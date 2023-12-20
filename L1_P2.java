package Inherit1;

// -> A constructor is a special method which is invoked during the creation of an object of a class.
// -> A constructor is used to initialize the object of a class.
// -> In default constructor super() is always invoked

class Parent
{
    int a , b ;

    Parent()
    {
        // super() : it is responsible for calling the default constructor of object class
        a = 10 ;
        b = 20 ;
        System.out.println("Parent's Default Constructor");
    }
}

class Child extends Parent
{
    int x , y ;

    Child()
    {
        // super() : it is responsible for calling parent class default constructor
        x = 100 ;
        y = 200 ;

        System.out.println("Child's Default Constructor");
    }

    void display()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }

}

public class L1_P2 {
    public static void main(String[] args) {
        
        Child c = new Child() ;
        c.display();
    }
}
