#include<iostream>
using namespace std;

class Student
{
    public:
        Student()
        {
            string collegeName = "MVGR";
            int collegeCode=33;
            cout<<"CollegeName : "<<collegeName<<endl;
            cout<<"CollegeCode: "<<collegeCode<<endl;
        }
        Student(string fullName, double semPerentage)
        {
            cout<<"FullName : "<<fullName<<endl;
            cout<<"SemPercentage : "<<semPerentage<<endl;
        }
        ~Student(){}
};

int main()
{
    Student venkat;
    Student venkat01("SaiVenkat",86.789);
    return 0;
}