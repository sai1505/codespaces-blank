#include<iostream>
using namespace std;

class Lion
{
    public:
        void displayBreed()
        {
            cout<<"I belong to the carnivore type.\nI belong to genus Panthera\n";
        }
        void eat()
        {
            cout<<"I eat meat and cheese\n";
        }

};

class Cub: public Lion
{
    public:
        void play()
        {
            cout<<"I play a lot\nIt helps me to bond to my family\n";
        }
        void skills()
        {
            cout<<"With this I develop lot of skills that I could use later\n";
        }
};

int main()
{
    Cub obj;
    obj.displayBreed();
    obj.eat();
    obj.play();
    obj.skills();
    return 0;
}
