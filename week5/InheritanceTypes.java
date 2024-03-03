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

class ClassD extends ClassB
{
    public
        void dClass()
        {
            System.out.print("Iam a ClassD"+"\n");
        }
}

/*class ClassE extends ClassA,ClassB
{
    
}*/
/*Java doesnt support Multiple Inheritance and Hybrid Inheritance.*/

public class InheritanceTypes
{
    public static void main(String[] args)
    {
        //Simple Inheritance
        System.out.print("Simple Inheritance"+"\n");
        ClassB class1=new ClassB();
        class1.aClass();
        class1.bClass();
        //Hierarichal Inheritance
        System.out.print("Hierarichal Inheritance"+"\n");
        ClassC class2=new ClassC();
        class1.aClass();
        class1.bClass();
        class2.aClass();
        class2.cClass();
        //Multi-Level Inheritance
        System.out.print("Multi-Level Inheritance"+"\n");
        ClassD class3=new ClassD();
        class3.aClass();
        class3.bClass();
        class3.dClass();
        /*Java does not support multiple inheritances to avoid the diamond problem 
        which causes complexity and ambiguity. Well we can acheive multiple inheritance by the concept of interface.*/
    }
}