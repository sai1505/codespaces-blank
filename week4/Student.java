/*Using a constructor and destructor in Java, Write a Java class 'Student' and assign the following :
* string fullName
* int rollNum
* double semPerentage
* string collegeName
* int collegeCode */
import java.util.Scanner;
class Student01
{
    public
        Student01()
        {
            System.out.print("Student class initialized\nIam a student\n");
        }
        String fullName;
        int rollNum;
        double semPercentage;
        String collegeName;
        int collegeCode;
}

public class Student
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Student01 venkat=new Student01();
        System.out.print("Enter your sweet name : ");
        venkat.fullName=input.nextLine();
        System.out.print("Enter your rollNumber : ");
        venkat.rollNum=input.nextInt();
        System.out.print("Enter your semPercentage : ");
        venkat.semPercentage=input.nextDouble();
        input.nextLine();
        System.out.print("Enter your collegeName : ");
        venkat.collegeName=input.nextLine();
        System.out.print("Enter your collegeCode : ");
        venkat.collegeCode=input.nextInt();
        System.out.print("Name : "+venkat.fullName+"\n");
        System.out.print("RollNumber : "+venkat.rollNum+"\n");
        System.out.print("SemPercentage : "+venkat.semPercentage+"\n");
        System.out.print("CollegeName : "+venkat.collegeName+"\n");
        System.out.print("CollegeCode : "+venkat.collegeCode+"\n");
        input.close();
    }
}
