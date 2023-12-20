package Inherit1;

class Vehicle
{
    final int x = 10 ;
    // final void output()
    // {
    //     System.out.println("Vehicle");
    // }
}

class Car extends Vehicle
{
    int x = 20 ;
    super.x ++ ;
    void output()
    {
        System.out.println(super.x+1);
    }
    
}
public class L1_P8 {
    public static void main(String[] args) {
        Car c = new Car() ;
        c.output();
    }
}
