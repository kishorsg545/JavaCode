package lambda;

public class LamdaExpressionDemo
{
    public static void main(String[] args)
    {
       Hello hello= ()-> System.out.println("Hello World");
        Hello hello1= ()-> System.out.println("Hello World1");
       hello.sayHello();
       hello1.sayHello();
       sayHello(()-> System.out.println("Ram"));
        ArithmeticOperation adding=(a,b)-> a+b;
        System.out.println(adding.operation(10,20));
        ArithmeticOperation subtracting=(a,b)-> a-b;
        System.out.println(adding.operation(30,20));
        ArithmeticOperation dividing=(a,b)-> a/b;
        System.out.println(adding.operation(10,20));
        ArithmeticOperation multiplying=(a,b)-> a*b;
        System.out.println(adding.operation(10,20));

    }
    public static void sayHello(Hello h)
    {
        h.sayHello();
    }
}
