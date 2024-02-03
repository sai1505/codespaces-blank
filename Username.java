import java.util.Scanner;
class Username
{
  public static void main(String[] args)
  {
    String user;
    System.out.print("Enter the user name : ");
    Scanner input=new Scanner(System.in);
    user=input.nextLine();
    input.close();
    System.out.print("Hello, "+user);
  }
}
