#include<iostream>
using namespace std;

int main()
{
  float a,b;
  int choice;
  cout<<"Enter the values of a and b : ";
  cin>>a>>b;
  cout<<"The following operations are\n";
  cout<<"1. ADDITION\n2. SUBTRACTION\n3. MULTIPLICATION\n4. DIVISION\n5. MODULUS\n";
  cout<<"Enter the choice (1-5) : ";
  cin>>choice;
  switch(choice)
  {
    case 1:cout<<"The sum of the values "<<a<<" and "<<b<<" is "<<(a+b);
    break;
    case 2:cout<<"The difference of the values "<<a<<" and "<<b<<" is "<<(a-b);
    break;
    case 3:cout<<"The product of the values "<<a<<" and "<<b<<" is "<<(a*b);
    break;
    case 4:
          if(b==0)
          {
            cout<<"The division is not possible!!\nIt leads to undefined.\n";
          }
          else
          {
            cout<<"The quotient of the values "<<a<<" and "<<b<<" is "<<(a/b);
          }
    break;
    case 5:cout<<"The remainder of the values "<<a<<" and "<<b<<" is "<<(int(a)%int(b));
    break;
  }
  return 0;
}