/*Using a constructor and destructor in Java, Write a Java class 'Student' and assign the following :
1.default constructor (string collegeName = "MVGR", int collegeCode=33)
2.parameterized constructor (string fullName, double semPerentage)
Also create the objects respectivelty asd display their values.*/
class Student
{
    public
        Student()
        {
            String collegeName="MVGR";
            int collegeCode=33;
            System.out.print("CollegeName : "+collegeName+"\n");
            System.out.print("CollegeCode : "+collegeCode+"\n");
        }
        Student(String fullName, double semPercentage)
        {
            System.out.print("fullName : "+fullName+"\n");
            System.out.print("semPercentage: "+semPercentage+"\n");
        }
}

public class Constructor
{
    public static void main(String[] args)
    {
        @SuppressWarnings("unused")
        Student venkat=new Student();
        @SuppressWarnings("unused")
        Student venkat01=new Student("Sai Venkat",89);
    }
}
