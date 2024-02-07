#include<iostream>
using namespace std;

void find(int a);

int main()
{
  int a;
  cout<<"Enter the value of a : ";
  cin>>a;
  find(a);
  return 0;
}

void find(int a)
{
  if(a==0)
  {
    cout<<a<<" is neither even nor odd\n";
  }
  else if(a%2==0)
  {
    cout<<a<<" is even\n";
  }
  else
  {
    cout<<a<<" is odd\n";
  }
}