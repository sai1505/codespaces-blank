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
    @SuppressWarnings("unused")
    Student venkat01=new Student("B.SaiVenkat",92);
  }
}
