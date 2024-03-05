#include<iostream>
using namespace std;

class AccessSpecifierDemo
{
    private:
        int privateVar;
    protected:
        int protectedVar;
    public:
        int publicVar;
    public:
        void setVar(int priv,int protect,int pub)
        {
            privateVar=priv;
            protectedVar=protect;
            publicVar=pub;
        }
        void getVar()
        {
            cout<<"Private : "<<privateVar<<endl;
            cout<<"Protected : "<<protectedVar<<endl;
            cout<<"Public : "<<publicVar<<endl;
        }
};

int main()
{
    AccessSpecifierDemo obj;
    int priv,protect,pub;
    cout<<"Enter the values of Private, Protected and Public : ";
    cin>>priv>>protect>>pub;
    obj.setVar(priv,protect,pub);
    cout<<"The values are"<<endl;
    obj.getVar();
    return 0;
}
