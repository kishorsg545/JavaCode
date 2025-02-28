package polymorphism;

public class Overloading
{
    void eat()
    {
        System.out.println("eating food");
    }
}
class B1 extends Overloading
{
    void eat(String food)
    {
        System.out.println(food);
    }
}
class main1
{
    public static void main(String[] args) {
        Overloading a=new Overloading();
        a.eat();
        B1 a1=new B1();
        a1.eat("Maggi");

    }
}