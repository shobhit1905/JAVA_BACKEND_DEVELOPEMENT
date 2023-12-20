package Inherit1;

//MULTILEVEL INGERITANCE
class Demo
{
    String name = "Shobhit" ;
    int age = 20 ;

    void display()
    {
        System.out.println("Demo : " + name + " " + age);
    }
}

class Demo1 extends Demo
{}


class Demo2 extends Demo1 
{}

public class L1_P1 {
    public static void main(String[] args) {
        Demo ob1 = new Demo() ;
        Demo1 ob2 = new Demo1() ;
        Demo2 ob3 = new Demo2() ;

        Demo obj = new Demo2() ; // DYNAMIC METHOD DISPATCH

        ob1.display();
        ob2.display(); 
        ob3.display();
        obj.display();
    }
}
