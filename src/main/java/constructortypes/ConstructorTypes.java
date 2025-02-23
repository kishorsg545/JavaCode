package constructortypes;

public class ConstructorTypes
{
    String name;
    int age;
    String city;


   public ConstructorTypes()
    {

    }
    ConstructorTypes(int age,String name,String city)
    {
        this.age = age;
        this.name = name;
        this.city = city;
        System.out.println("My name "+name +" i am "+age+" years old and i live in "+city);
    }

    public static void main(String[] args)
    {
        ConstructorTypes personInfo=new ConstructorTypes(20,"Ram","pune");

    }

}
