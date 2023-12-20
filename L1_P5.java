package Inherit1;

// super keyword is used to refer variables of parent class
// super() method is used to call the constructor of parent class

class Parent2
{
    int age = 30 ;

    void print()
    {
        System.out.println("Age : " + age);
    }
}

class Child2 extends Parent2
{
    int age = 8 ;

    void disp()
    {
        super.print() ;
        System.out.println("Age = " + age);
    }
}
public class L1_P5 {
    public static void main(String[] args) {
        Child2 ob = new Child2() ;
        ob.disp();
    }
}
