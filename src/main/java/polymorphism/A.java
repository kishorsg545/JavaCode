package polymorphism;

public class A
{
    String name;

    void show()
    {
        System.out.println("print class a");
    }
    void eat()
    {
        System.out.println("Eating");
    }
}
class B extends A
{
    @Override
    void show()
    {
        System.out.println(super.name="shyam");
        super.name="shyam";
        System.out.println("print class b");
    }
    @Override
    void eat()
    {
        System.out.println("Running");
    }

}
class main
{
    public static void main(String[] args)
    {
        A a=new A(); // Stating Polymorphism
        a.show();
        a.eat();
        B b=new B();
        b.show();
        b.eat();


        A a1=new B();// Dynamic Polymorphism
        a1.show();
    }
}
