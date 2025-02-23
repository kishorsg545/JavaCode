package org.methods;

public class MethodsInvocation
{
    void sum(int a,int b)
    {
        int c=a+b;
        number(20);
        number2(30);
        System.out.println(c);
    }
    void number(int a)
    {
        number2(30);
        System.out.println(a);
    }
     void number2(int b)
    {
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        MethodsInvocation a1=new MethodsInvocation();
            a1.sum(10,20);
    }
}
