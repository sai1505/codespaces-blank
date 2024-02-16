#include<iostream>
using namespace std;

class Student
{
    public:
        string fullName;
        int rollNum;
        double semPerentage;
        string collegeName;
        int collegeCode;
        Student()
        {
            cout<<"Student class initialized!!\nIam a student\n";
        }
        ~Student(){}
};

int main()
{
    Student venkat;
    cout<<"Enter your name : ";
    getline(cin,venkat.fullName);
    cout<<"Enter your roll number : ";
    cin>>venkat.rollNum;
    cout<<"Enter your sem percentage : ";
    cin>>venkat.semPerentage;
    cout<<"Enter your college name : ";
    cin>>venkat.collegeName;
    cout<<"Enter your college code : ";
    cin>>venkat.collegeCode;
    cout<<"Name : "<<venkat.fullName<<endl;
    cout<<"RollNum : "<<venkat.rollNum<<endl;
    cout<<"SemPercentage : "<<venkat.semPerentage<<endl;
    cout<<"CollegeName : "<<venkat.collegeName<<endl;
    cout<<"CollegeCode : "<<venkat.collegeCode<<endl;
    return 0;
}
