#include<iostream>
using namespace std;
class Venkat
{
    public:
        void variant()
        {
            cout<<"I have a variant where we are similar in few ways\n";
        }
        void variant(string variantName)
        {
            cout<<"VariantName : "<<variantName<<endl;
        }
};
int main()
{
    Venkat obj;
    obj.variant(),obj.variant("A.SaiVenkat");
    return 0;
}
