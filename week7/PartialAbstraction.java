abstract class Shape
{
    abstract float area();
    void display()
    {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape
{
    float a,b;
    Rectangle(float base,float height)
    {
        a=base;
        b=height;
    }
    public float area()
    {
        return a*b;
    }
}

class Traingle extends Shape
{
    float a,b;
    Traingle(float base,float height)
    {
        a=base;
        b=height;
    }
    public float area()
    {
        return (float)0.50*a*b;
    }
}
public class PartialAbstraction
{
    public static void main(String[] args) 
    {
        Rectangle obj=new Rectangle(23,45);
        Traingle obj1=new Traingle(67,89);
        System.out.println("Area of Rectangle : "+obj.area());
        System.out.println("Area of Triangle : "+obj1.area());
    }
}
