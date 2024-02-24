import java.util.Scanner;

class Student019
{
  public
    String fullName;
    int rollNum;
    double semPercentage;
    String collegeName;
    int collegeCode;
    Student019()
    {
      System.out.println("Student class is created successfully!!\nIam a student\n");
    }
    protected void finalize() throws Throwable
    {
      System.out.println("The class is finalized\n");
    }
}

public class Student
{
  public static void main(String[] args)
  {
    Student019 venkat=new Student019();;
    Scanner input=new Scanner(System.in);
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
