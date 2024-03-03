class ClassA
{
    public
        void aClass()
        {
            System.out.print("Iam a ClassA"+"\n");
        }
}

class ClassB extends ClassA
{
    public
        void bClass()
        {
            System.out.print("Iam a ClassB"+"\n");
        }
}

class ClassC extends ClassA
{
    public
        void cClass()
        {
            System.out.print("Iam a ClassC"+"\n");
        }
}

/*class ClassD extends ClassA,ClassB
{

}*/
//Here the actual problem occurs where the support of Multipe Inheritance in java is eliminated.

public class DaimondProblem 
{
    public static void main(String[] args)
    {
        System.out.print("Diamond Problem"+"\n");
        ClassB class1=new ClassB();
        ClassC class2=new ClassC();
        class1.aClass();
        class1.bClass();
        class2.aClass();
        class2.cClass();
        /*We can access upto half part part of the diamond problem. The other half includes the multiple Inheritance.
        Java does not support multiple inheritances to avoid the diamond problem which causes complexity and ambiguity.
        Well we can acheive multiple inheritance by the concept of interface.*/
    }
}
