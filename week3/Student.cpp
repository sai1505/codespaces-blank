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
    venkat.fullName="SaiVenkat";
    venkat.rollNum=519;
    venkat.semPerentage=85.478;
    venkat.collegeName="Maharaj Vijayaram Gajapathi Raj College Of Engineering";
    venkat.collegeCode=33;
    cout<<"Name : "<<venkat.fullName<<endl;
    cout<<"RollNum : "<<venkat.rollNum<<endl;
    cout<<"SemPercentage : "<<venkat.semPerentage<<endl;
    cout<<"CollegeName : "<<venkat.collegeName<<endl;
    cout<<"CollegeCode : "<<venkat.collegeCode<<endl;
    return 0;
}