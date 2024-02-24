import java.util.Scanner;
class Student
{
  public
    Student()
    {
      String collegeName="MVGR";
      int collegeCode=33;
      System.out.print("CollegeName : "+collegeName+"\n"+"CollegeCode : "+collegeCode+"\n");
    }
    Student(String fullName,double semPercentage)
    {
      System.out.print("FullName : "+fullName+"\n"+"SemPercentage : "+semPercentage);
    }
}

public class Constructor
{
  public static void main(String[] args)
  {
    @SuppressWarnings("unused")
    Student venkat=new Student();
    Scanner input=new Scanner(System.in);
    System.out.print("FullName : ");
    String fullName=input.nextLine();
    System.out.print("SemPercentage : ");
    double semPercentage=input.nextDouble();
    input.close();
    @SuppressWarnings("unused")
    Student venkat01=new Student(fullName,semPercentage);

  }
}
