package Inherit1;

// METHOD OVERRIDING : run-time/dynamic polymorphism
class Plane
{
    void takeoff() // Inherited Method
    {
        System.out.println("Plane is taking off");
    }

    void fly()
    {
        System.out.println("Plane is flying");
    }

    void land()  // Inherited Method
    {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane
{
    void fly() // Overriden Method
    {
        System.out.println("CargoPlane fly at lower height");
    }
    void carry() // Specific Method
    {
        System.out.println("CargoPlane can carry goods");
    }
}
public class L1_P7 {
    
    // METHOD OVERLOADING : compile-time/static polymorphism
    static int area(int s)
    {
        return s*s ;
    }

    static int area(int a , int b)
    {
        return a*b ;
    }

    static void area()
    {
        return ;
    }
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane() ;
        cp.takeoff();
        cp.fly();
        cp.carry();
        cp.land();

        System.out.println("s = 10 : area = " + area(10));
        System.out.println("a = 10 , b = 20 : area = " + area(10,20)); 
    }
}
