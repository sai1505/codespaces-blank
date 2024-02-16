#include<iostream>
#include "areaBox.h"
#include "volumeBox.h"
using namespace std;

int main()
{
  float length,breadth,height;
  cout<<"Enter the length, breadth, and height : ";
  cin>>length>>breadth>>height;
  #ifdef AREA
  {
    area(length,breadth,height);
  }
  #endif
  #ifndef AREA
  {
    cout<<"You have not included areaBox.h file"<<endl;
  }
  #endif
  #ifdef VOLUME
  {
    volume(length,breadth,height);
  }
  #endif
  #ifndef VOLUME
  {
    cout<<"You have not included volume.h file"<<endl;
  }
  #endif
  return 0;
}
