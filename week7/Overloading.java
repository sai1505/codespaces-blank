class Venkat
{
    public
        void variant()
        {
            System.out.println("I have a variant where we are similar in few ways");
        }
        void variant(String variantName)
        {
            System.out.println("VariantName : "+variantName);
        }
}
public class Overloading 
{
    public static void main(String[] args) 
    {
        Venkat obj=new Venkat();
        obj.variant();
        obj.variant("A.SaiVenkat");
    }
}
