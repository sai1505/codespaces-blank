#include<iostream>
using namespace std;

class Shapes
{
    private:
    virtual float area()=0;
};

class Triangle: public Shapes
{
    public:
    float b,h;
    Triangle(float base,float height)
    {
        b=base;
        h=height;
    }
    float area()
    {
        return 0.5*b*h;
    }
};

class Circle: public Shapes
{
    public:
    float r;
    Circle(float radius)
    {
        r=radius;
    }
    float area()
    {
        return 3.14*r*r;
    }
};

int main()
{
    Triangle tri(2,4);
    Circle cir(3.5);
    cout<<"Area of the Triangle : "<<tri.area()<<endl;
    cout<<"Area of the Circle: "<<cir.area()<<endl;
    return 0;
}