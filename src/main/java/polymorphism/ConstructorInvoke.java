package polymorphism;

public class ConstructorInvoke
{
    String name;
    ConstructorInvoke(String name)
    {
        this.name=name;

    }
    void makeSound()
    {
        System.out.println("Sound");
    }

}
class Z extends ConstructorInvoke
{
    Z ()
    {
        super("ram");

        // super("Ram");
        super.makeSound();
        System.out.println("sound..............");
    }
}
class main2
{
    public static void main(String[] args) {
        Z z=new Z();
        //System.out.println(z.name);
        z.makeSound();
    }
}
