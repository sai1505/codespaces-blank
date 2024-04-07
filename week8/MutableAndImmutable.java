class Immutable{
    private final String a="B.SaiVenkat";
    Immutable(String a){
        //this.a=a;
        //This shows an error because we have given the variable as final means we cannot anything
        //and the value cannot be overriden.
    }
    void display(){
        System.out.println("Name : "+a);
    }
}

public class MutableAndImmutable {
    public static void main(String[] args) {
        //Mutuable Object
        StringBuilder obj=new StringBuilder("Sai");
        obj.append(" ");
        obj.append("Venkat");
        String a=obj.toString();
        System.out.println("The final modified string : "+a);
        //Immutable object
        Immutable obj1=new Immutable("Deadpool");
        obj1.display();
    }
}
