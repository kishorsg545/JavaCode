package polymorphism;

public class MethodHiding
{
    public static void main(String[] args) {
        Apple apple=new Apple();
        apple.eat();
        Orange orange=new Orange();
        orange.eat();


        Apple.eat();
        Orange.color();
        ((Apple)orange).eat();

    }
}
